package bai1;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD cần đổi: ");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd ;
        System.out.println("Giá trị VNĐ = "+ quydoi+ "đ");
    }
}
