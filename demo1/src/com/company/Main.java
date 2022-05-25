package com.company;

public class Main {

    public static void main(String[] args) {
        // java array
        int arr[] = {1, 2, 3, 4};
        // try catch java blocks
        // try block
        try{
            // printing element
            System.out.println(arr[-1]);
        }
        // catch block
        catch(ArithmeticException e){
            // giving out message
            System.out.println("Zero division error");
        }
        // catch block
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of range!!");
        }
    }
}
