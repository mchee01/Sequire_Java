package basic.day2;

public class HomeStringFormatLHB {
    public static void main(String[] args) {
        int start = 10;

        // String.format을 사용해서 10부터 20까지의 수들을 10진수, 8진수, 16진수로 표시

        // 10진수
        System.out.print(String.format("%-15s %s","10진수"," : "));
        while (start <= 20) {
            System.out.print(String.format("%4d ", start++));
        }
        System.out.println();
        start = 10;

        // 8진수
        System.out.print(String.format("%-15s %s","8진수"," : "));
        while (start <= 20) {
            System.out.print(String.format("%04o ", start++));
        }
        System.out.println();
        start = 10;

        // 16진수
        System.out.print(String.format("%-15s %s","16진수"," : "));
        while (start <= 20) {
            System.out.print(String.format("%04X ", start++));
        }

    }
}
