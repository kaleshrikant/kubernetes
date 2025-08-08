package com.kaleshrikant.controller;

import com.kaleshrikant.entity.Order;
import com.kaleshrikant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Shrikant Kale
 * @Date 8/8/25
 */

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@PostMapping
	public Order addOrder(@RequestBody Order order){
		return service.addOrder(order);
	}

	@GetMapping
	public List<Order> getOrders(){
		return service.getOrders();
	}

	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable int id){
		return service.getOrderById(id);
	}
}
