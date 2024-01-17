package basic.day2;

public class A10StringVariable {
    
    public static void main(String[] args) {
        //String 은 문자열 : 문자(' ')의 집합. 문자열 리터럴은 기호 "" 사용합니다.
        String message = "Hello~ 안녕!! 하이하이";

        System.out.println(message);
        System.out.println("메세지 '"+ message + "'의 길이 : " + message.length());
        
        message="welcome~ java world!!!!";
        System.out.println("메세지 '"+ message + "'의 길이 : " + message.length());

        // String 으로 선언된 변수는 `객체`입니다. 
        // 그래서 여러가지 메소드를 갖고 필요한 기능들을 제공해 줍니다.

        //char imo ='😀';     //char은 2바이트 이모지는 4바이트.문자형으로 저장 안됨.
        String imo="😁";    // 이모지는 문자열로 저장해야 합니다.
        System.out.println(imo);

       


    }
}
