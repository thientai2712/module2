package com.company.views;

import java.util.Scanner;

import static com.company.views.MainLauncher.menuOption;

public class OrderViewLauncher {
    public static void run(){
        MainLauncher.orderMenu();
        Scanner scanner = new Scanner(System.in);
        OrderView orderView = new OrderView();
        System.out.println("\nChọn chức năng");
        System.out.print("⭆ ");
        int choices = scanner.nextInt();
        switch (choices){
            case 1:
                orderView.addOrder();
                break;
            case 2:
                orderView.showAllOrder();
                break;
            case 3:
                menuOption();
                break;
            default:
                System.err.println("Chọn sai! vui lòng nhập lại");
                run();
        }
    }
}
