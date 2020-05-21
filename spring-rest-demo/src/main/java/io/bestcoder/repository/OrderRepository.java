package io.bestcoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.bestcoder.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
