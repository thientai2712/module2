package model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private String fullName;
    private String phone;
    private String address;
    private Integer size;
    private Double grandTotal;
    private Instant creareAt;
    List<OrderItem> orderItems = new ArrayList<>();
    private Order(){

    }
    public Order(long id,int size, String fullName, String phone, String address){
    this.id = id;
    this.fullName = fullName;
    this.phone = phone;
    this.address = address;
    this.size = size;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }

    public void setEmail(String address) {
        this.address = address;
    }

    public String getEmail(){
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setCreareAt(Instant creareAt) {
        this.creareAt = creareAt;
    }

    public Instant getCreareAt() {
        return creareAt;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    @Override
    public String toString() {
        return  id +
                "," + fullName +
                "," + phone +
                "," + address +
                "," + orderItems;
    }
}
