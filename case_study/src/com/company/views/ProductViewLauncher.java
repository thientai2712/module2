package com.company.views;

import com.company.utils.AppUtils;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.company.views.MainLauncher.menuOption;

public class ProductViewLauncher {
    public static void run() {
        int number;
        do {
            Scanner scanner = new Scanner(System.in);
            ProductView productView = new ProductView();
            menuShoes();
            try {
                System.out.println("\nChọn chức năng: ");
                System.out.print("⭆ ");
                number = scanner.nextInt();
                switch (number) {
                    case 1:
                        productView.add();
                        break;
                    case 2:
                        productView.update();
                        break;
                    case 3:
                        productView.remove();
                        break;
                    case 4:
                        productView.showProducts(InputOption.SHOW);
                        break;
                    case 5:
                        productView.sortByPriceOrderByASC();
                        break;
                    case 6:
                        menuOption();
                        break;
                    default:
                        System.err.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        run();
                }
            } catch (InputMismatchException io) {
                System.err.println("Nhập sai! Vui lòng nhập lại");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        } while (true);
    }
    public static void menuShoes() {
        System.out.println();
        System.out.println("* * * * * *  --MENU SHOES-- * * * * * * *");
        System.out.println("*                                        *");
        System.out.println("*    1. Thêm giày                        *");
        System.out.println("*    2. Sửa thông tin giày               *");
        System.out.println("*    3. Xoá giày                         *");
        System.out.println("*    4. Hiển thị tất cả giày             *");
        System.out.println("*    5. Hiển thị giày theo giá tăng dần  *");
        System.out.println("*    6. Quay lại                         *");
        System.out.println("*                                        *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * ");
    }
}