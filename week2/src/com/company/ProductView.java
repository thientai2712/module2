package com.company;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;

import java.util.Scanner;

public class ProductView {
    public static Scanner scanner = new Scanner(System.in);
    public static void run(){
        int option;
        do {
            show();
            System.out.println("Chọn chức năng ");
            System.out.print(" ⭆ ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    System.out.println("Hiển thị sản phầm");
                    break;
                case 2:
                    System.out.println("Thêm sản phẩm thành công");
                    break;
                case 3:
                    System.out.println("Cập nhật sản phẩm thành công");
                case 9:
                    System.exit(0);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không đúng! Vui lòng chọn lại!");
            }

        }while (option !=8);
    }
    public static void show() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪  PRODUCT MANAGER  ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪     1. Hiển thị sản phầm             ⚪");
        System.out.println("⚪     2. Thêm sản phẩm                 ⚪");
        System.out.println("⚪     3. Cập nhật sản phẩm             ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("Nhấn '8' để trở lại \t|\t '9' để thoát chương trình");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }

}
