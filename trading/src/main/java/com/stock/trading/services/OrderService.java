package com.stock.trading.services;

import com.stock.trading.model.OrderMaster;
import com.stock.trading.repository.OrderMasterRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private OrderMasterRepository orderRepository;

    public List<OrderMaster> getAllOrders() {
        return orderRepository.findAll();
    }
    
    public OrderMaster createOrder(OrderMaster orderMaster) {
        // Set status as "created" before saving
        orderMaster.setStatus("created");
        return orderRepository.save(orderMaster);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
