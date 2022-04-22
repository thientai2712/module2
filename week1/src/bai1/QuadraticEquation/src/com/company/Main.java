package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getDiscriminant());
        if(a==0){
            if(b==0){
                System.out.println("The equation has no solution");
            }else {
                System.out.println("The Equation has a solution: "+ "x = " + (-c/b));
            }
        }else  if(quadraticEquation.getDiscriminant()>0){
            System.out.println("The Equation has 2 solution: "+" Solution 1 = " + quadraticEquation.getRoot1() +" and "+" Solution 2 = "+ quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("The Equation has a solution: "+ quadraticEquation.uniqueExperience());
        }else {
            System.out.println("The equation has no solution");
        }
    }
}
