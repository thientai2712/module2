package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int arr[] = {5,1,1,7,10,20,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chèn: ");
        int value = scanner.nextInt();
        System.out.print("Nhập vào vị trí cần chèn: ");
        int index = scanner.nextInt();
        int n = arr.length-1;
        for (int i = n; i > index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        System.out.println("");
        for (int element : arr){
            System.out.println(element + "");
        }
        System.out.println();
    }
}
