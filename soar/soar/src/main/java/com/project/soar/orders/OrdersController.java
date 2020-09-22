package com.project.soar.orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class OrdersController {

	@Autowired
	private OrdersDao odao;
	
	@GetMapping("/orders")
	public List<Order> getOrders(){
		return (List<Order>) odao.findAll();
	}
	
//	@GetMapping("/orderbyempid")
//	public void getOrdersByEmpid(@RequestBody Integer id){
//		
//	}
//	
//	@PostMapping("/place")
//	public void placeOrder(@RequestBody Order order) {
//		odao.save(order);
//	}
//	
//	
//	@DeleteMapping("/droporder")
//	public void dropOrder(@RequestBody Integer id) {
//		odao.deleteById(id);
//	}
}
