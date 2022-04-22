package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m, n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cột: ");
        m = scanner.nextInt();
        System.out.print("Nhâp vào số hàng: ");
        n = scanner.nextInt();
        System.out.print("Nhập vào cột bất kì: ");
        int colum = scanner.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr [" + i + "]" + "[" + j + "]" + "=");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == colum) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tổng = " + sum);

    }
}

