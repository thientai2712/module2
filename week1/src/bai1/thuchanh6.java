package bai1;

import java.util.Scanner;

public class thuchanh6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter the year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year%4==0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year%100==0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year%400==0;
                if (isDivisibleBy400){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        if(isLeapYear){
            System.out.printf("%d is a leap Year", year);
        }else {
            System.out.printf("%d is Not a leap Year", year);
        }
       //if (year%4==0){
            //if (year%100==0){
                //if(year%400==0){
                    //System.out.printf("%d Is a leap year", year);
               // }else {
                   // System.out.printf("%d is Not a leap year", year);
              //  }
          //  }else {
             //   System.out.printf("%d is Not a leap year", year);
           // }
       // }else {
          //  System.out.printf("%d is Not a leap year", year);
       // }
   }
}

