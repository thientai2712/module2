package com.company.stackarray;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(reserveArray());
        System.out.println(reserveString());
    }
    public static Stack<Integer> reserveArray(){
        int size, element;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng: ");
        size = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<size;i++){
            System.out.print("Nhập phần tử thứ "+ (i+1)+": ");
            element = Integer.parseInt(scanner.nextLine());
            stack.push(element);
        }
        Stack<Integer> stack1 = new Stack<>();
        for (int i=0; i<size;i++){
            stack1.push(stack.pop());
        }
        return stack1;
    }
    public static String reserveString(){
        String str;
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();
        for (int i = 0; i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String result = "";
        for (int i = 0; i<str.length();i++){
            result += stack.pop();
        }
        return result;
    }
}
