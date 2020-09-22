package com.project.soar.orders;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersDao extends CrudRepository<Order,Integer>{

}
