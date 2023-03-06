package com.kbstar.dto;

public class ItemDTO {
	private int itmNum;
	private String itmName;
	private int itmPrice;
	
	public ItemDTO() {
	}

	public ItemDTO(int itmNum, String itmName, int itmPrice) {
		this.itmNum = itmNum;
		this.itmName = itmName;
		this.itmPrice = itmPrice;
	}

	
	public int getItmNum() {
		return itmNum;
	}

	public void setItmNum(int itmNum) {
		this.itmNum = itmNum;
	}

	public String getItmName() {
		return itmName;
	}

	public void setItmName(String itmName) {
		this.itmName = itmName;
	}

	public int getItmPrice() {
		return itmPrice;
	}

	public void setItmPrice(int itmPrice) {
		this.itmPrice = itmPrice;
	}

	public String toString() {
		return "ItemDTO : [itmNum= " + itmNum + " itmName= " + itmName + "itmPrice= " + itmPrice + "]";
	}
	
}
