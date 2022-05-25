package com.company.models;

import java.time.Instant;

public class Product {
    private long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String description;

    public Product() {

    }

    public Product(long id, String name, Double price, Integer quantity, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public static Product parse(String record) {
        String[] fields = record.split(",");
        long id = Long.parseLong(fields[0]);
        String name = fields[1];
        double price = Double.parseDouble(fields[2]);
        int quantity = Integer.parseInt(fields[3]);
        String description = fields[4];
        return new Product(id, name, price, quantity, description);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return description;
    }

    public void setTitle(String title) {
        this.description = title;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s",
                id,
                name,
                price,
                quantity,
                description);
    }
}
