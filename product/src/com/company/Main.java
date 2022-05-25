package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product nokia = new Product(1,"Nokia", 5500000);
        Product iphone = new Product( 2, "Iphone",10000000);
        Product samsung = new Product( 3, "SamSung", 7000000);
        Product apple = new Product( 4, "Apple", 700000);
        productManager.productList.add(nokia);
        productManager.productList.add(iphone);
        productManager.productList.add(samsung);
        productManager.productList.add(apple);
        productManager.showProduct();
        productManager.setProductListWithId(1, "apple", 5000);
        productManager.showProduct();
        productManager.removeProduct(4);
        productManager.addProduct(1,"dso",10000);
        productManager.showProduct();
        productManager.findProductInProductWithName("Samsung");
        //productManager.menuManager();
    }
}
