package basic.day4;

public class ProbStringReverse {
    
    public static void main(String[] args) {
        String message = "Hello World";     //length: 11 , 인덱스는 0~10
        char[] messageArray = new char[message.length()];

        int cidx =message.length()-1;       //10
        for(int i=0;i<message.length();i++){
            char temp = message.charAt(i);      //i=0 일때       
            messageArray[cidx]=temp;            //cidx=10 입니다.
            //i=1 일 때, cidx=9 /  i=2 일 때, cidx=8  / i=3 일 때, cidx=7 
            cidx--;     //cidx 변수 없이 사용할 공식 찾아보세요.
        }

        System.out.println("뒤집기 결과 :");
        System.out.println(messageArray);
    }
}
