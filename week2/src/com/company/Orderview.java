package com.company;

import java.util.Scanner;

public class Orderview {
    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int option;
        do {
            show();
            System.out.println("Chọn chức năng ");
            System.out.print(" ⭆ ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Hiện thị số order hiện tại");
                    break;
                case 2:
                    System.out.println("Thêm order thành công");
                    break;
                case 3:
                    System.out.println("Cập nhật thông tin order thành công");
                    break;
                case 9:
                    System.exit(0);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không đúng! Vui lòng chọn lại!");
                    break;
            }
        } while (option != 8);
    }

    public static void show() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪   ORDER MANAGER   ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪     1. Hiển thị order                ⚪");
        System.out.println("⚪     2. Thêm order                    ⚪");
        System.out.println("⚪     3. Cập nhật order                ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("Nhấn '8' để trở lại \t|\t '9' để thoát chương trình");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }
}
