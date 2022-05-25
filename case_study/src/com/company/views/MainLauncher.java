package com.company.views;

import com.company.utils.AppUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainLauncher {
    static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("⚪ ⚪ ⚪ ⚪   WELCOME TO SHOES MANAGER  ⚪ ⚪ ⚪");
        System.out.println("⚪                                         ⚪");
        System.out.println("⚪     1. Quản lý người dùng               ⚪");
        System.out.println("⚪     2. Quản lý giày                     ⚪");
        System.out.println("⚪     3. Quản lý hóa đơn                  ⚪");
        System.out.println("⚪     0. Thoát                            ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }

    public static void orderMenu() {
        System.out.println("✬ ✬ ✬ ✬ ✬ ✬ ✬ORDER MENU✬ ✬ ✬ ✬ ✬ ✬ ✬");
        System.out.println("✬                                       ✬");
        System.out.println("✬     1. Tạo order                      ✬");
        System.out.println("✬     2. Xem danh sách order            ✬");
        System.out.println("✬     3. Trở lại                        ✬");
        System.out.println("✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬");
    }

    public static void lunch() {
        AdminView adminView = new AdminView();
        adminView.adminLogin();
        menuOption();

    }

    public static void menuOption() {
        do {
            mainMenu();
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("\nChọn chức năng");
                System.out.println("⭆ ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        UserViewLauncher.run();
                        break;
                    case 2:
                        ProductViewLauncher.run();
                        break;
                    case 3:
                        OrderViewLauncher.run();
                        break;
                    case 0:
                        AppUtils.exit();
                        break;
                    default:
                        System.err.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        menuOption();
                }

            } catch (InputMismatchException io) {
                System.out.println("Nhập sai! Vui lòng nhập lại");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } while (true);
    }
}
