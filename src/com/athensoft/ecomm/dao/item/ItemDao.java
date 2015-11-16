package com.athensoft.ecomm.dao.item;

import java.util.List;

import com.athensoft.ecomm.entity.item.Item;

public interface ItemDao {
	public List<Item> findAll();
}
