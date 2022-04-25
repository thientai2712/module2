package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần đọc: ");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (number >= 10 && number < 20) {
            switch (number) {
                case 11:
                    System.out.println("Elevent");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("have the number 4" + " read as: fourteen");
                    break;
                case 15:
                    System.out.println("have the number 5" + "read as: Fiveteen");
                    break;
                case 16:
                    System.out.println("have the number 6" + "read as: Sixteen");
                    break;
                case 17:
                    System.out.println("have the number 7" + "read as: Seventeen");
                    break;
                case 18:
                    System.out.println("have the number 8" + "read as: Eighteen");
                    break;
                case 19:
                    System.out.println("have the number 9" + "read as: Nineteen");
                    break;

            }
            //b3: đọc số nhỏ hơn 20
        } else if (number >= 20 && number < 100) {
            //b4: đọc sô lớn hơn 20
            int dozens = number / 10;

            switch (dozens) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fivety");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
                // unit hàng đơn vị

            }

            int unit = number % 10;
            switch (unit) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            System.out.println("Number convert: " + dozens + unit);
        } else if (number >= 100 && number < 1000) {
            //b5: đọc số có 3 chữ số
            int hundreds = number / 100;
            switch (hundreds) {
                case 1:
                    System.out.println("One hundred");
                    break;
                case 2:
                    System.out.println("Two hundred");
                    break;
                case 3:
                    System.out.println("Three hundred");
                    break;
                case 4:
                    System.out.println("Four hundred");
                    break;
                case 5:
                    System.out.println("Five hundred");
                    break;
                case 6:
                    System.out.println("Six hundred");
                    break;
                case 7:
                    System.out.println("Seven hundred");
                    break;
                case 8:
                    System.out.println("Eight hundred");
                    break;
                case 9:
                    System.out.println("Nine hundred");
                    break;
            }

            int dozens = (number % 100) / 10;
            switch (dozens) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fivety");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
                // unit hàng đơn vị

            }

            int unit = number % 10;
            switch (unit) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            System.out.print("Number convert: " + hundreds + dozens + unit);
        } else {
            System.out.print("Số bạn nhập không thỏa");
        }
    }
}
