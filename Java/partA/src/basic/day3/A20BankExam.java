package basic.day3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A20BankExam {
    public static void main(String[] args) {
        
        int menu;
        int money;  //입금액 또는 출금액 키보드 입력값
        int balance=0;  //잔액
        boolean run=true;
        Scanner sc = new Scanner(System.in);
        //세자리마다 컴마 찍기 : 아직 배운 진도가 아니지만 일단은 사용하기
        DecimalFormat df = new DecimalFormat("#,### 원");
        while(run){
            System.out.println("-~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-");
			System.out.println("  1:예금 | 2:출금 | 3:잔액 | 4:종료");
			System.out.println("-~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-");
			System.out.print("메뉴 선택 >>> ");
			menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("예금액 > ");
                    money = sc.nextInt();
                    balance += money;
                    System.out.println("😀고객님의 잔액은 " + df.format(balance) + " 입니다.");
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    money = sc.nextInt();
                    
                    if(money <= balance)
                        balance -= money;
                    else 
                        System.out.println("고객님의 잔액이 출금액보다 부족합니다.");

                    System.out.println("😀고객님의 잔액은 " + df.format(balance)  + " 입니다.");
                    break;
                case 3:
                    System.out.println("현재 잔고 : " + df.format(balance) );
                    break;
                case 4:
                    run=false;
                    break;
                default:        //case 1,2,3,4 모두 아닌 경우 실행.
                    System.out.println("잘못된 메뉴 선택값 입니다.1~4 만 입력하세요.");
                    break;
            }//switch end
        }// while end
        System.out.println("프로그램을 종료합니다.");
        System.out.println("오늘은 그만하고 싶어요.ㅠㅠㅠㅠ");
    }
}
