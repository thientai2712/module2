package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];
        System.out.print("Ma trận là: "+ "\n");
        for (int i = 0; i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = A[0][0];
        for (int i = 0; i<m;i++){
            for (int j=0;j<n;j++){
                if (max<A[i][j]){
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phần từ lớn nhất trong mảng là: " + max);
    }
}
