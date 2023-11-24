package session02;

import java.util.Scanner;

public class If_Else_Demo {
    public static void main(String[] args) {
        //1. Nhập vào 1 số, kiểm tra là số chẵn hay số lẻ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.printf("%d là số chẵn\n", number);
        } else {
            System.out.printf("%d là số lẻ\n", number);
        }
        //2. In ra số dư trong phép chia 3
        if (number % 3 == 0) {
            System.out.printf("%d chia hết cho 3\n", number);
        } else if (number % 3 == 1) {
            System.out.printf("%d chia 3 dư 1\n", number);
        } else {
            System.out.printf("%d chia 3 dư 2\n", number);
        }
        //3. Ứng dụng: Nhập 1 số, sử dụng if-else if - else in ra số dư trong phép chia 5
    }
}
