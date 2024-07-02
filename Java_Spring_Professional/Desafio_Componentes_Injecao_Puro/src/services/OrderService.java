package services;

import entities.Order;

public class OrderService {

    private ShippingService shippingService;

    public OrderService() {
    }

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double totalOrder(Order order) {
        // Calcula el total del pedido restando el descuento y sumando el costo de envío
        return order.getBasic() - amountDiscount(order) + shippingService.shipping(order.getBasic());
    }

    public Integer returnCode(Order order) {
        return order.getCode();
    }

    public double amountDiscount(Order order) {
        // Calcula el descuento en base al porcentaje del valor básico
        return order.getBasic() * (order.getDiscount() / 100);
    }
}
