package com.company;

import java.util.Scanner;

public class UserViewLauncher {
    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int option = -1;
        do {
            show();
            try {
                do {//Khong thich hien lại cả menu
                    System.out.println("Chọn chức năng");
                    System.out.print(" ⭆ ");
                    option = Integer.parseInt(scanner.nextLine());
                    if (option > 4 || option < 1)
                        System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                } while (option > 4 || option < 1);
                switch (option) {
                    case 1:
                        System.out.println("Thêm người dùng thành công");
                        break;
                    case 2:
                        System.out.println("Cập nhật người dùng thành công");
                        break;
                    case 3:
                        System.out.println("Danh sách người dùng");
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Chức năng bạn chọn không đúng! Vui lòng chọn lại!");
                }
            } catch (Exception ex) {
                System.out.println("Nhập sai! vui lòng nhập lại");
            }
            } while (option != 4) ;
    }

    public static void show() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪   USERS MANAGER   ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                       ⚪");
        System.out.println("⚪     1. Thêm người dùng                ⚪");
        System.out.println("⚪     2. Sửa thông tin người dùng       ⚪");
        System.out.println("⚪     3. Hiện danh sách người dùng      ⚪");
        System.out.println("⚪     4. Quay lại                       ⚪");
        System.out.println("⚪                                       ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }
}