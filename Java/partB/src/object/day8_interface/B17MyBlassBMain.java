package object.day8_interface;

public class B17MyBlassBMain {
    
    public static void main(String[] args) {
        MyClassB myb = new MyClassB();
        //다중 구현 클래스인 MyClassB 는
        // 두 가지 업 캐스팅 가능합니다.
        InterfaceA ifa = new MyClassB();
        InterfaceX ifx = new MyClassB();

        myb.methodA();
        ifa.methodA();
      //  ifx.methoadA();   //오류 : methodA는 InterfaceA의 추상메소드.
                          // 다른 인터페이스 참조 타입으로는 메소드 실행 못함.

        ifx.methodX();
      //  ifa.methodX();    //오류 : methodX는 InterfaceX의 추상메소드. 
                          // 다른 인터페이스 참조 타입으로는 메소드 실행 못함.
                          
        InterfaceX ix = (InterfaceX) ifa; 
        ix.methodX();                         
    }
}
