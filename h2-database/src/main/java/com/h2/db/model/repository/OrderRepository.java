package com.h2.db.model.repository;

import com.h2.db.model.OrderEntity;
import com.h2.db.model.TblProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository  extends CrudRepository<OrderEntity, Long> {
}