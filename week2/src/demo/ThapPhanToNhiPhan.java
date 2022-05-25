package demo;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanToNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập vào số thập phân: ");
        int num = scanner.nextInt();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
            System.out.println("\nGiá trị nhị phân là: ");
            while (!stack.isEmpty()) {
                System.out.print(stack.pop()+" ");
            }
    }
}