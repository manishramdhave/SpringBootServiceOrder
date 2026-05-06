package com.velocity.restcontroller;

import java.util.Arrays;
import java.util.List;
import com.velocity.model.Order; // Import your model
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /*
     * Restful web service to return a list of Orders
     */
    @GetMapping("/getOrder")
    public List<Order> getOrder() {
        // Mocking a list of orders
        return Arrays.asList(
            new Order(101, "Laptop", 1200.50, "Shipped"),
            new Order(102, "Smartphone", 800.00, "Processing"),
            new Order(103, "Headphones", 150.00, "Delivered")
        );
    }
}
