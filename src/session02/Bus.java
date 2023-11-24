package session02;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        //B1: Nhập tuổi người đi xe bus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tuổi bạn:");
        int age = Integer.parseInt(scanner.nextLine());
        //B2: Tính vé xe bus
        float price;
        if (age < 6 || age >= 60) {
            price = 0;
        } else if (age < 18) {
            price = 7000 * 0.5F;
        } else {
            price = 7000;
        }
        //B3: in tiền vé xe bus
        System.out.println("Giá vé xe bus của bạn: " + price);
    }
}
