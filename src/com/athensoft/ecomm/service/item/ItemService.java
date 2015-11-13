package com.athensoft.ecomm.service.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.item.ItemDao;

@Service
public class ItemService {
	private ItemDao itemDao;
	
	@Autowired
	@Qualifier("itemDaoParam")
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	
}
