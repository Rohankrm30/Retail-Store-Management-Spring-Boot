package com.store.service;

import com.store.models.CartDTO;
import com.store.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
