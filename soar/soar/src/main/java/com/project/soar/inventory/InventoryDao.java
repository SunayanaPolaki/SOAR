package com.project.soar.inventory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryDao extends CrudRepository<Inventory, Integer> {

}
