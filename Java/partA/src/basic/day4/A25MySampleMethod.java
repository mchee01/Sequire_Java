package basic.day4;

//A25 소스파일은 구글드라이브에 올려주세요.
public class A25MySampleMethod {
    //A22번 1) ~ 5) 을 각각 메소드로 정의해 보기 - 메소드안에서 출력문 만들지 않습니다.리턴값 전달이 목적.
    // 1) sum1ToN   2) multiply1ToN  3) sumMToN    4) multiplyMToN  5)multiplyNof2
    // 6) 구구단 `출력`하는 메소드. 리턴은 void. printGuguDan
    public static void main(String[] args) {

        int result = addMToN(2,5);
        boolean isOk = checkJumsu(267);
        

    }

    private static boolean checkJumsu(int jumsu) {
        return jumsu>=0 && jumsu<=100;
    }

    private static int addMToN(int i, int j) {
        int sum=0;
        for(int k=i;k<=j;k++){
            sum+=k;
        }
        return sum;
    }

    public static int sum1ToN(int n){
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
        return sum;
    }
    public static long multiply1ToN(int n){
        long result=1;
        for(int i=1;i<=n;i++) {
            result *= i;
        }
        return result;
    }

     public static int sumMToN(int m, int n){
        int sum=0;
        for(int i=m;i<=n;i++) {
            sum += i;
        }
        return sum;
    }
    public static long multiplyMToN(int m, int n){
        long result=1;
         for(int i=m;i<=n;i++) {
            result *= i;
        }
        return result;
    }
    public static long multiplyNof2(int n){
        long result=1;
         for(int i=1;i<=n;i++) {
            result *= 2;
        }
        return result;
    }
   
}
