package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n;
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();
        int A[][] = new int[n][n];
        System.out.print("Nhập các phần từ cho ma trận: "+ "\n");
        for (int i=0;i<n;i++){
            for (int j = 0;j<n;j++){
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j]= scanner.nextInt();
            }
        }
        System.out.print("Ma trận vừa nhập là: "+ "\n");
        for (int i =0;i<n;i++){
            for (int j = 0; j<n;j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i = 0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j){
                    sum +=A[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);
    }
}
