package com.company;

import javax.jws.soap.SOAPBinding;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        Product[] products = new Product[]{
                new Product(1, "quynhanh", 60),
                new Product(4, "bui di hoc", 45),
                new Product(2, "tienbip", 67),
                new Product(6, "thien", 67),
                new Product(7, "tiebip", 67)
        };
        for (Product pro : products){
            System.out.println(pro);
        }
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
//        bubbleSort(products);
        sortSelection(products);
        System.out.println(Arrays.toString(products));

    }
    public static void bubbleSort(Product[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                //  if (array[j]>array[j + 1]) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    Product x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }
    public static void sortSelection(Product[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_indx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min_indx])> 0) {
                    min_indx = j;
                }

                Product temp = arr[min_indx];
                arr[min_indx] = arr[i];
                arr[i] = temp;
            }
        }

    }
}
