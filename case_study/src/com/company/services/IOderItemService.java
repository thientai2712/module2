package com.company.services;

import com.company.models.OrderItem;
import com.company.models.User;

import java.util.List;

public interface IOderItemService {
    List<OrderItem> findAll();

    void add(OrderItem newOrderItem);

    void update(OrderItem newOrderItem);

    OrderItem getOrderItemById(int id);
}
