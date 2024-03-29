package object.test;

import java.util.Random;


// 각문제에 대한 데이터 처리
public class AdditionQuestion {
    private int data1;  //랜덤으로 생성된 2자리 수
    private int data2;

    //11부터 99까지 랜덤한 수 
    public AdditionQuestion() {     //생성자에서 랜덤값을 준것은 좋은 접근입니다.
        Random random = new Random();
        this.data1 = random.nextInt(89) + 11;  
        this.data2 = random.nextInt(89) + 11;
    }

    //문제 출력
    public String getQuestionString(int questionNumber) {       
        return questionNumber + ". " + data1 + " + " + data2 + "= ?";
    }

    //정답을 리턴
    public int getCorrectAnswer() {     //클래스 설계도에는 이 메소드 대신에 isRight() 가 있습니다.
        return data1 + data2;
    }

    public int getData1() {
        return data1;
    }
    public int getData2() {
        return data2;
    }

}
