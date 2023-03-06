package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<String, ItemDTO>{

	@Override
	public void insert(ItemDTO v) {
		System.out.println(v.getItmName() + "이(가) 아이템 목록에 추가되었습니다.");
	}

	@Override
	public void delete(String k) {
		System.out.println(k + "이(가) 아이템 목록에서 삭제되었습니다.");
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v.getItmName() + "의 정보가 수정되었습니다.");
	}

}
