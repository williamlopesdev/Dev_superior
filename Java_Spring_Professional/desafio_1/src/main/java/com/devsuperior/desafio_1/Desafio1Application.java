package com.devsuperior.desafio_1;

import com.devsuperior.desafio_1.entities.Order;
import com.devsuperior.desafio_1.services.OrderService;
import com.devsuperior.desafio_1.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {


	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1, 150.00, 10.0);
		Order order2 = new Order(2, 99.00, 0.0);
		Order order3 = new Order(2, 201.00, 20.0);



		Integer returnCode = orderService.returnCode(order);
		double totalOrder = orderService.totalOrder(order);

		System.out.println("Código do pedido: " + returnCode);
		System.out.println("Total do pedido: " + String.format("%.2f", totalOrder));
	}
}
