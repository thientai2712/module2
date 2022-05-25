package shape;

public class Main {
    public static void main(String[] args) {
//        Shape[] shapes = new Shape[3];
//        shapes[0] = new Circle(2);
//        System.out.println("Diện tích hình tròn ban đầu: " + ((Circle) shapes[0]).getArea());
//        ((Circle) shapes[0]).resize(3);
//
//        shapes[1] = new Rectangle(2, 4) {
//            @Override
//            public void setHeight(double height) {
//
//            }
//        };
//        System.out.println("Diện tích hình chữ nhật ban đầu: " + ((Rectangle) shapes[1]).getArea());
//        ((Rectangle) shapes[1]).resize(2);
//
//        shapes[2] = new Square(4);
//        System.out.println("Diện tích hình vuông ban đầu: " + ((Square) shapes[2]).getArea());
//        ((Square) shapes[2]).resize(4);
//
//        for (Shape shape : shapes) {
//            if (shape instanceof Circle) {
//                System.out.printf("Diện tích hình tròn sau khi tăng kích thước là:%.2f%n ", ((Circle) shape).getArea());
//            } else if (shape instanceof Rectangle && !(shape instanceof Square)) {
//                System.out.printf("Diện tích hình chữ nhật sau khi tăng kích thước là:%.2f%n ", ((Rectangle) shape).getArea());
//            } else {
//                System.out.printf("Diện tích hình vuông sau khi tăng kích thước là:%.2f%n ", ((Square) shape).getArea());
//            }
//        }
            int x = (int) Math.floor(Math.random() * 10);
            int y = (int) Math.floor(Math.random() * 10);
            int z = (int) Math.floor(Math.random() * 100);
            System.out.println("z: " + z + ", y: " + y + ", x: " + x);
            Shape[] shapes = new Shape[3];
            shapes[0] = new Circle(x, "Gray", true);
            shapes[1] = new Square("black", true, x);
            shapes[2] = new Rectangle(x, y, "blue", true);

            for (Shape shape : shapes) {
                System.out.println(shape);
                if(shape instanceof Colorable)
                    ((Colorable) shape).howToColor();
            }
            System.out.println("\n");
            for (Shape shape : shapes) {
                shape.resize(z);
                System.out.println(shape);
                if(shape instanceof Colorable)
                    ((Colorable) shape).howToColor();
            }
        }
    }
