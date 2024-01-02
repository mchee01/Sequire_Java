package basic.day01;

public class ProbChangeMoney {
    public static void main(String[] args) {

        /*한/일 23.12.28기준 환율
         * 살때 1엔 = 9.29원
         * 팔때 1엔 = 8.97원
         * 
         * 원화를 엔화로 환전하기
         * 환전할 엔화는 1000000입니다.
         * 원화를 엔화로 바꿀 때: 107642.62648008612원 입니다.
         * 
         * 엔화를 원화로 환전할 경우
         * 일본에서 사용한 금액은 98760엔 dlqslek
         * 남은 엔화는 얼마인가요?(정수)8882dps
         * 엔화를 원화로 바꿀때 : 79671.54000000001원
        */
        //--------변수 선언지역--------
        int myWon=1000000;//여행경비 (100만원)
        int myYen;//남은 여행경비

        int cost;//여행비용
        
        double toWon;//남은 경비 환전한 원화값
        double toYen;//환전한 엔화값
        
        double yenTowonRate=9.29;
        double wonToYenRate=8.97;
        //------변수 선언지역 끝--------

        //원화를 엔화로 환전하는경우
        toYen = myWon / yenTowonRate;
        //엔화를 원화로 환전하는경우
        cost = 98760;//여행경비
        myYen = (int)toYen - cost;//여행경비 계산식
        toWon = myYen * wonToYenRate;

        System.out.println("한/일 23.12.28 기준 환율");
        System.out.println("일본환율:"+yenTowonRate);
        System.out.println("원화 환율:"+8.97+"\n");
        System.out.println("원화를 엔화로 환전");
        System.out.println("환전할 원화는"+myWon+"원 입니다.");
        System.out.println("원화를 엔화로 바꾸면"+toYen+"입니다.\n");
        System.out.println("일본에서 사용한 금액은"+cost+"입니다.");
        System.out.println("남은 엔화는 "+myYen+"엔 이고,");
        System.out.println("엔화를 원화로 바꾸게 되면"+toWon+"원 입니다.");
    }
}
