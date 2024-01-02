package basic.day01;

import java.util.Scanner;

//변수 활용 연습  (1줄 주석 단축키는 ctrl + / , 여러줄 주석은 ctrl + shift + /)
/*문제  : 어떤 학생의 중간고사 총점은 322 , 과목수는 4개 입니다. 모두 항상 정수입니다.
	이 학생의 평균을 구하려고 합니다. 변수는 총점은 sum, 과목개수는 count 로 합니다.
	평균(나눗셈 연산은 / )를 계산합니다.  
	1) 평균 저장 변수를 정수 avgInt   2) 평균 저장 변수를 실수 avgDouble 각각 해보세요.
	계산한 1) 2)를 각각 출력 합니다. => 오류가 생길까요? 아니오.
	이유 및 설명: 캐스팅이 일어나게 되면서 뒷자리의 실수는 전부 0으로 채워지기 때문에
	오류가 안납니다. 자동형변환 조건 : bit 수가 원래 bit 수보다 높으면 자동 형변환이 일어나게 됨.
*/
public class A04DataCasting {

	//public static void main(String[] args) {
		// int sum;
		// int count;
		// int avgInt;
		// double avgDouble;
		// Scanner sc = new Scanner(System.in);
		// //업데이트 예정 : 사용자로부터 값을 입력하도록 합니다.
		// System.out.print("시험점수를 입력하세요.:");
		// sum =sc.nextInt();
		// count=4;
		// avgInt = sum/count;
		// avgDouble = sum/count;		
		// // sum/count 는 정수연산으로 결과는 80. 이 값이 double 변수에 저장되면서 .0 만 생깁니다. 
		
		// System.out.println("정수형식 평균 :" + avgInt);
		// System.out.println("실수형식 평균 :" + avgDouble);
		
		// sum 또는 count 중 하나를 실수 형식으로 바꾸어서 나눗셈을 하면 결과가 80.5 가 나옵니다.
		// avgDouble = (double)sum/count;			//sum을 강제로 변환(캐스팅)
		// System.out.println("실수형식으로 변환 후 평균 :" + avgDouble);
		// Scanner sc = new Scanner(System.in);
		// System.out.println("\n 자동 캐스팅(자동형변환) 의 예");
		// double dnum = sc.nextInt();
		// int inum = (int)3.1415;
		// System.out.println("자동캐스팅된 dnum 의 값)"+dnum);
		// System.out.println("강제 캐스팅된 inum 의3.1415 값)"+inum );
	//}
}
