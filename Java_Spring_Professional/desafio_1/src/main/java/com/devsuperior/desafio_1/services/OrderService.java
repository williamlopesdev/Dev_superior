package com.devsuperior.desafio_1.services;

import com.devsuperior.desafio_1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double totalOrder(Order order) {
        return order.getBasic() - amountDiscount(order) + shippingService.shipping(order.getBasic());
    }

    public Integer returnCode(Order order) {
        return order.getCode();
    }

    public double amountDiscount(Order order) {
        return order.getBasic() * (order.getDiscount() / 100);
    }
}
