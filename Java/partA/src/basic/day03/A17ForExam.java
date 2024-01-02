package basic.day03;

// import java.util.Scanner;

public class A17ForExam {
    public static void main(String[] args) {
        String message = "hello word";
        // Scanner sc = new Scanner(System.in);
        for(int i=0;i <= message.length(); i++){ 
            char temp = message.charAt(i);
            System.out.println("i="+i+", 문자="+temp);
        }
        int k=0;
        while (k==0) {
            char temp = message.charAt(k);
            System.out.println("k="+k + ", 문자="+temp);
            k++;
        }
        int count = 0;
        for(int i=0; i<=message.length(); i++){
            char temp = message.charAt(i);
            if(temp=='o'){
                count++;
            }
        }
        // System.out.println("o의 개수는 "+count+" 입니다.");
    }
}
