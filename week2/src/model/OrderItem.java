package model;

public class OrderItem {
    private Long id;
    private double price;
    private int quantity;
    private long orderId;
    private int shoesId;
    private String shoesName;
    public OrderItem(long id,String shoesName, double price, int quantity, long orderId, int shoesId){
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.orderId = orderId;
        this.shoesId = shoesId;
        this.shoesName = shoesName;
    }
    public OrderItem(){

    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setShoesId(int shoesId) {
        this.shoesId = shoesId;
    }

    public int getShoesId() {
        return shoesId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setShoesName(String shoesName) {
        this.shoesName = shoesName;
    }

    public String getShoesName() {
        return shoesName;
    }


    @Override
    public String toString() {
        return id +
                "," + price +
                "," + quantity +
                "," + orderId +
                "," + shoesId +
                "," + shoesName + '\'';
    }
}
