package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [][] matrix = new int[10][10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+matrix.length+"rows and "+ matrix[0].length + "colums: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
    }
}
