package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class ItemService implements Service<String, ItemDTO>{

	DAO<String, ItemDTO> dao;
	
	public ItemService() {
		dao = new ItemDAO();
	}
	
	@Override
	public void register(ItemDTO v) {
		System.out.println("Item list Check...");
		dao.insert(v);
		System.out.println("Complete");
	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("Complete");
		
	}

	@Override
	public void modify(ItemDTO v) {
		dao.update(v);
		System.out.println("Complete");
		
	}

}
