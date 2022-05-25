package com.company;

import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void show() {
        System.out.println("⚪ ⚪ ⚪ ⚪   WELCOME TO SHOES MANAGER  ⚪ ⚪ ⚪");
        System.out.println("⚪                                         ⚪");
        System.out.println("⚪     1. Quản lý người dùng               ⚪");
        System.out.println("⚪     2. Quản lý giày                     ⚪");
        System.out.println("⚪     3. Quản lý hóa đơn                  ⚪");
        System.out.println("⚪     0. Thoát                            ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }
    public static  void lunch(){
        int option;
        do {
            show();
            System.out.println(" Chọn chức năng ");
            System.out.print(" ⭆ ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    UserViewLauncher.run();
                    break;
                case 2:
                    ProductView.run();
                    break;
                case 3:
                    Orderview.run();
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không đúng! Vui lòng chọn lại!");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }

        }while (option != 0);
    }
}
