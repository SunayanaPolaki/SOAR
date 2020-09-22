package com.project.soar.inventory;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class InventoryController {
	
	@Autowired
	private InventoryDao idao;
	
	@GetMapping("/stocks")
	public List<Inventory> getInventories(){
		return (List<Inventory>) idao.findAll();
	}
	
}
