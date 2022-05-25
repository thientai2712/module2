package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class ProductManager {
    public ArrayList<Product> productList;
    public ProductManager(){
        productList = new ArrayList<>();
        this.productList = productList;
    }
    //Kiểm tra xem sản phẩm đã có trong list chưa
    public boolean isThereAnyProductOnTheList(Product product){
        if (!productList.isEmpty()){
            for (Product products : productList){
                if (products == product){
                    return true;
                }
            }
        }
        return false;
    }
    //Kiểm tra xem id có trùng không
    public boolean isIdInProductList(int id){
        if (!productList.isEmpty()){
            for (Product products : productList){
                if (products.getId()==id){
                    return true;
                }
            }
        }
        return false;
    }
    //kiểm tra xem tên có trùng không
    public boolean isNameAProductList(String name){
        if (!productList.isEmpty()){
            for (Product products : productList){
                if (products.getName().equalsIgnoreCase(name)){
                    return true;
                }
            }
        }
        return false;
    }
    //Thêm sản phẩm
    public void addProduct(int id, String name, double price){

        Scanner scanner = new Scanner(System.in);
        //Kiểm tra tên có tên sản phầm đã có chưa
        do {
            System.out.println("Product name: ");
            name = scanner.nextLine();
            if (isNameAProductList(name)){
                System.out.println("Product have had in the product list");
            }
        }while (isNameAProductList(name));
        //Kiểm tra id đã có chưa?
        do {
            System.out.println("Product id: ");
            id = scanner.nextInt();
            if (isIdInProductList(id)){
                System.out.println("ID had in the prodcut list");
            }
        }while (isIdInProductList(id));
        System.out.println("Product price: ");
        price = scanner.nextDouble();
        Product newProduct = new Product(id,name,price);
        productList.add(newProduct);

    }
    public  void setProductListWithId(int id, String name, int price){
        if (productList.isEmpty()){
            System.out.println("There are no product in the list");
        }else {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()){
                    productList.get(i).setName(name);
                    productList.get(i).setPrice(price);
                    System.out.println("Edit secess!!");
                    return;
                }
            }
        }
    }
    public void removeProduct(int id){
        if (productList.isEmpty()){
            System.out.println("There are no product in the list");
        }else {
            for (int i = 0; i < productList.size(); i++) {
                if (id == productList.get(i).getId()){
                    productList.remove(productList.get(i));
                    System.out.println("Remove sucesss!!");
                    return;
                }
            }
        }
    }
    public void findProductInProductWithName(String name){
        List<Product> productListSearch = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productListSearch.get(i).getName().equalsIgnoreCase(name)){
                System.out.println();
            }
            if (productList.get(i).getName() == name) {
                productListSearch.add(productList.get(i));
            }
        }
        if (productListSearch.isEmpty()){
            System.out.println("There are no product in searchList");
            return;
        }
        System.out.println("Product list search");
        for (int i = 0; i <  productListSearch.size(); i++) {
            System.out.println(productListSearch.get(i));
        }
    }
    public void showProduct(){
        System.out.println("Product list: ");
        for (Product product : productList){
            System.out.println(product.toString());
        }
    }
}
