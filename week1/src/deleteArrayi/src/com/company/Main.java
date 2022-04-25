package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {5,1,7,8,0,10};
        System.out.print("Nhập vào số cần xóa: ");
        int X,j,i;
        X = scanner.nextInt();
        for ( j = i = 0; i< array.length;i++){
            if (array[i]!=X){
                array[j] = array[i];
                j++;
            }
        }
        for (i = 0; i< array.length-1;i++){
            System.out.print(array[i] + "\t");
        }
    }
}
