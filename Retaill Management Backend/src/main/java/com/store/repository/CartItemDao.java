package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
