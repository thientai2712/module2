package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string;
        char text;
        int count =0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kì: ");
        string = scanner.nextLine();
        System.out.println("Nhập kí tự bất kì: ");
        text = scanner.next().charAt(0);
        for (int i = 0;i<string.length();i++){
            if (string.charAt(i)==text){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện ký tự" + text +"trong chuỗi"+ string + "="+ count);
    }
}
