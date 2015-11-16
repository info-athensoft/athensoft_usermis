package com.athensoft.ecomm.service.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.ecomm.dao.item.ItemDao;
import com.athensoft.ecomm.entity.item.Item;

@Service
public class ItemService {
	private ItemDao itemDao;
	
	@Autowired
	@Qualifier("itemDaoParam")
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	public List<Item> getItemAll(){
		return itemDao.findAll();
	}
	
	
}
