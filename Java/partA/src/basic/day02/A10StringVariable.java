package basic.day02;

public class A10StringVariable {
    public static void main(String[] args) {
        //char imo = '😊'; //char 는 2바이트를 갖고있고 이모지는 4바이트므로 문자형으로 저장안됨.
        String imo = "😂"; //이모지는 문자열로 저장해야함.
        String message = "안녕하세요!";
        System.out.println(message);
        System.out.println(imo);
        System.out.println("메세지'"+message+"'의 길이 :"+message.length());

        String test = "";
        test.format(test, args);
        test.charAt(0);
        test.indexOf(0, 0);
        test.indexOf(test);
        test.valueOf(false);
        Integer string_Value = 1;
        

    }
}
