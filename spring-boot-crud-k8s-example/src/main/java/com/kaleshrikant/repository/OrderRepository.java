package com.kaleshrikant.repository;

import com.kaleshrikant.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Shrikant Kale
 * @Date 8/8/25
 */

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
