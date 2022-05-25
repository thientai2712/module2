package com.company.views;

import com.company.models.Order;
import com.company.models.OrderItem;
import com.company.models.Product;
import com.company.services.*;
import com.company.utils.AppUtils;
import com.company.utils.ValidateUtils;

import java.util.List;
import java.util.Scanner;

public class OrderView {
    private final IProductService productService;//Dependency Inversion Principle (SOLID)


    private final IOrderService orderService; //Dependency Inversion Principle (SOLID)


    private final IOderItemService oderItemService; //Dependency Inversion Principle (SOLID)
    private final Scanner scanner = new Scanner(System.in);

    public OrderView() {
        productService = ProductService.getInstance();
        orderService = OrderService.getInstance();
        oderItemService = OrderItemService.getInstance();
    }

    public OrderItem addOrderItems(long orderId) {
        oderItemService.findAll();
        ProductView productView = new ProductView();
        productView.showProducts(InputOption.ADD);
        long id = System.currentTimeMillis() / 1000;
        System.out.println("Nhập id giày: ");
        System.out.print(" ⭆ ");
        int shoesId = scanner.nextInt();
        scanner.nextLine();
        while (!productService.existsById(shoesId)) {
            System.out.println("Id giày không tồn tại");
            System.out.println("Nhập id giày: ");
            System.out.print(" ⭆ ");
            shoesId = scanner.nextInt();
        }
        Product product = productService.findById(shoesId);
        double price = product.getPrice();
        int oldQuantity = product.getQuantity();
        System.out.println("Nhập số lượng");
        System.out.print(" ⭆ ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        while (!checkQualityBakery(product, quantity)) {
            System.out.println("Vượt quá số lượng! Vui lòng nhập lại");
            System.out.println("Nhập số lượng");
            System.out.print(" ⭆ ");
            quantity = scanner.nextInt();
           //productService.updateQuantity(shoesId,quantity);
        }
        String shoesName = product.getName();
        double total = quantity * price;
        int currentQuantity = oldQuantity - quantity;
        product.setQuantity(currentQuantity);
        //bakeryService.update();
        OrderItem orderItem = new OrderItem(id, price, quantity, orderId, shoesId, shoesName, total);
        productService.updateQuantity(shoesId,quantity);
        return orderItem;
    }

    public boolean checkQualityBakery(Product product, int quantity) {
        if (quantity <= product.getQuantity())
            return true;
        else
            return false;
    }

    public void addOrder() {
        try {
            orderService.findAll();
            long orderId = System.currentTimeMillis() / 1000;
            System.out.println("Nhập họ và tên (vd: Phu Le) ");
            System.out.print(" ⭆ ");
            String name = scanner.nextLine();
            while (!ValidateUtils.isNameValid(name)) {
                System.out.println("Tên " + name + " không đúng." + " Vui lòng nhập lại!" + " (Tên phải viết hoa chữ cái đầu và không dấu)");
                System.out.println("Nhập tên (vd: Phu Le) ");
                System.out.print(" ⭆ ");
                name = scanner.nextLine();
            }
            System.out.println("Nhập số điên thoại");
            System.out.print(" ⭆ ");
            String phone = scanner.nextLine();
            while (!ValidateUtils.isPhoneValid(phone)) {
                System.out.println("Số " + phone + " của bạn không đúng. Vui lòng nhập lại! " + "(Số điện thoại bao gồm 10 số và bắt đầu là số 0)");
                System.out.println("Nhập số điện thoại (vd: 0363636366)");
                System.out.print(" ⭆ ");
                phone = scanner.nextLine();
            }
            System.out.println("Nhập địa chỉ");
            System.out.print(" ⭆ ");
            String address;
            while ((address = scanner.nextLine()).isEmpty()) {
                System.out.print("Địa chỉ không được để trống\n");
                System.out.print(" ⭆ ");
            }
            OrderItem orderItem = addOrderItems(orderId);
            Order order = new Order(orderId, name, phone, address);
            oderItemService.add(orderItem);
            orderService.add(order);
            System.out.println("Tạo đơn hàng thành công");
            do {
                System.out.println("㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡");
                System.out.println("㋡                                         ㋡");
                System.out.println("㋡     1. Nhấn 'y' để tạo tiếp đơn hàng    ㋡");
                System.out.println("㋡     2. Nhấn 'q' để trở lại              ㋡");
                System.out.println("㋡     3. Nhấn 'p' để in hoá đơn           ㋡");
                System.out.println("㋡     4. Nhấn 't' để thoát                ㋡");
                System.out.println("㋡                                         ㋡");
                System.out.println("㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡ ㋡");
                System.out.print(" ⭆ ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "y":
                        addOrder();
                        break;
                    case "q":
                        OrderViewLauncher.run();
                        break;
                    case "p":
                        showPaymentInfo(orderItem, order);
                        break;
                    case "t":
                        AppUtils.exit();
                        break;
                    default:
                        System.err.println("Nhập không hợp lệ! Vui lòng nhập lại");
                }
            } while (true);
        } catch (Exception e) {
            System.err.println("Nhập sai. vui lòng nhập lại!");
        }
    }

    public void showPaymentInfo(OrderItem orderItem, Order order) {
        double newTotal = orderItem.getPrice() * orderItem.getQuantity();

        try {
            System.out.println("----------------------------------------------------------HOÁ ĐƠN----------------------------------------------------------------");
            System.out.printf("|%-15s %-20s %-15s %-15s %-15s %-15s %-15s\n|", "   Id", "Tên khách hàng", "   SĐT", "Địa chỉ", "Tên giày", "Số lượng", "Giá");
            System.out.printf("%-15d %-20s %-15s %-15s %-15s %-15d %-15s \n|", order.getId(), order.getFullName(), order.getPhone(),
                    order.getAddress(), orderItem.getProductName(), orderItem.getQuantity(), AppUtils.doubleToVND(orderItem.getPrice()));
            System.out.println(" ------------------------------------------------------------------------------------------------- Tổng tiền:" + AppUtils.doubleToVND(newTotal));
            System.out.println("---------------------------------------------SHOES COLLECTIONS-----------------------------------------------------------------");
            boolean is = true;
            do {
                System.out.println("Nhấn 'q' để trở lại \t|\t 't' để thoát chương trình");
                System.out.println("Nhấn ");
                System.out.print(" ⭆ ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "q":
                        OrderViewLauncher.run();
                        break;
                    case "t":
                        AppUtils.exit();
                        break;

                    default:
                        System.err.println("Nhấn không đúng! vui lòng chọn lại");
                        is = false;
                }
            } while (!is);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void showAllOrder() {
        List<Order> orders = orderService.findAll();
        List<OrderItem> orderItems = oderItemService.findAll();
        OrderItem newOrderItem = new OrderItem();
        try {
            System.out.println("----------------------------------------------------------LIST ORDER--------------------------------------------------------------------");
            System.out.println("|                                                                                                                                                       |");
            System.out.printf("|%-15s %-20s %-12s %-18s %-15s %-15s %-18s %-16s\n|", "   Id", "Tên khách hàng", "  SĐT", "Địa chỉ","Tên giày", "Số lượng", "Giá", "Tổng" + "            |");
            for (Order order : orders) {
                for (OrderItem orderItem : orderItems) {
                    if (orderItem.getOrderId() == order.getId()) {
                        newOrderItem = orderItem;
                        break;
                    }
                }
                double newTotal = newOrderItem.getPrice() * newOrderItem.getQuantity();
                System.out.printf("%-15d %-20s %-12s %-15s %-20s %-10s %-18s %-13s %-7s\n|",
                        order.getId(),
                        order.getFullName(),
                        order.getPhone(),
                        order.getAddress(),
                        newOrderItem.getProductName(),
                        newOrderItem.getQuantity(),
                        AppUtils.doubleToVND(newOrderItem.getPrice()),
                        AppUtils.doubleToVND(newTotal),
                        "|");
            }
            System.out.println("                                                                                                                                               |");
            System.out.println("--------------------------------------------------SHOES COLLECTIONS--------------------------------------------------------------------");
            boolean is = true;
            do {
                System.out.println("Nhấn 'q' để trở lại \t|\t 't' để thoát chương trình");
                System.out.print(" ⭆ ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "q":
                        OrderViewLauncher.run();
                        break;
                    case "t":
                        AppUtils.exit();
                        break;
                    default:
                        System.err.println("Nhấn không đúng! vui lòng chọn lại");
                        is = false;
                }
            } while (!is);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
