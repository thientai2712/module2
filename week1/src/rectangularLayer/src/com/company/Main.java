package bai1.rectangularLayer.src.com.company;

import com.company.Square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the width: ");
//        double width = scanner.nextDouble();
//        System.out.println("Enter the height: ");
//        double height = scanner.nextDouble();
//        Rectangle rectangle = new Rectangle(width, height);
//        System.out.println("Your Rectangle \\n" + rectangle.display());
//        System.out.println("Perimeter of the Rectangle: " + rectangle.getPrimeter());
//        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Enter the edge: ");
        double edge = scanner.nextDouble();
        Square square = new Square(edge);
        System.out.println("Your Square: "+ square.display());
        System.out.println("Perimeter of the Square: "+ square.getPrimeter());
        System.out.println("Area of the Square: "+ square.getArea());
    }
}