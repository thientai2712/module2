package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập number: ");
        int number = scanner.nextInt();
        System.out.printf("%d Số nguyên tố đầu tiên là: \n", number);
        int cout = 0;
        int i = 2;
        while (cout < number){
            if (isPrime(i)){
                System.out.print(i + " ");
                cout++;
                cout++;
            }
            i++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            return check;
    }
}
