package model;

import java.time.Instant;

public class Shoes {
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private Integer size;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;
    public Shoes(Long id,String description, String name,Double price, Integer quantity, Integer size){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.size = size;
        this.description = description;
    }
    public Shoes(Long id, String name, Double price, Integer quantity, String description, Instant createdAt, Instant updatedAt){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,",
                id,
                name,
                price,
                quantity,
                description,
                createdAt,
                updatedAt);
    }
}
