package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Number: ");
        int number = scanner.nextInt();
        System.out.printf("Tất cả số nguyên tố nhỏ hơn %d là: \n", number);
        if (number >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < number; i += 2) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
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
