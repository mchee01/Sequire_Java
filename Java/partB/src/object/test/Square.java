package object.test;

import object.day7.Shape;       //다른 패키지 클래스는 import 필요.

public class Square extends Shape{

    
    //etc setter
    public void setEtc(String etc){
        this.etc=etc;       
        //Shape 의 상속 클래스는 etc 필드 직접 사용
    }

    //round setter
    public void setRound(int round){
        //   this.round = round;         
        // 오류 : Shape 과 같은 패키지 아니므로 직접 사용 못함.
    }

    @Override
    public void draw() {
        System.out.println("정사각형 " + this.getShapeName() + " 를 그립니다.");

    }
}
