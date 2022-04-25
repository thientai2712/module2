package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[4];
        int arr2[] = new int[4];
        for (int i = 0;i< arr1.length;i++){
            System.out.print("Enter input value into array 1: ");
            arr1[i] = scanner.nextInt();
        }
        for (int j = 0;j< arr2.length;j++){
            System.out.print("Enter input value into array 2: ");
            arr2[j] = scanner.nextInt();
        }
        int index = arr1.length + arr2.length;
        int arr3[] = new int[index];
        int count = 0;
        for (int k = 0;k< arr1.length;k++){
            arr3[k] = arr1[k];
            count++;
        }
        for (int k = 0;k< arr2.length;k++){
            arr3[count++] = arr2[k];
        }
        System.out.print("New Array is: ");
        for (int k = 0;k< arr3.length;k++){
            System.out.print(arr3[k]+ " ");
        }
    }
}
