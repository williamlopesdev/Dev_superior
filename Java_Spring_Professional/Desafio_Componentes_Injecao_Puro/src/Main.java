import entities.Order;
import services.OrderService;
import services.ShippingService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        Integer code = sc.nextInt();

        System.out.print("Valor Básico: ");
        double basic = sc.nextDouble();

        System.out.print("Desconto (%): ");
        double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);
        ShippingService shippingService = new ShippingService();
        OrderService orderService = new OrderService(shippingService);

        Integer returnCode = orderService.returnCode(order);
        double totalOrder = orderService.totalOrder(order);

        System.out.println("Código do pedido: " + returnCode);
        System.out.println("Total do pedido: " + String.format("%.2f", totalOrder));

        sc.close();
    }
}
