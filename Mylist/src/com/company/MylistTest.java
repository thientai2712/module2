package com.company;

public class MylistTest {
    public static void main(String[] args) {
        MyList<String> listNames = new MyList<>(5);
        listNames.add("Truong");
        listNames.add("Tung");
        listNames.add("Dung");
        listNames.add("Phuog");
        listNames.add(3, "ANh Khoa");
        //  listNames.clear();
        listNames.printMyList();
        listNames.remove(3);
        listNames.printMyList();


        MyList<Number> listNumber = new MyList<>(5);
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);
        listNumber.add(5);
        listNumber.add(6);
        listNumber.add(6);
        listNumber.printMyList();
        if (listNumber.contains(1)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
        if (listNumber.contains(6)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
    }
}
