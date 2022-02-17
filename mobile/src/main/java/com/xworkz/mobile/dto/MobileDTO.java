package com.xworkz.mobile.dto;

import java.io.Serializable;

public class MobileDTO implements Serializable {
	
	private String brandName;
	private String modelName;
	private int price;
	private byte ram;
	private int storagecapacity;
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public byte getRam() {
		return ram;
	}
	public void setRam(byte ram) {
		this.ram = ram;
	}
	
	public int getStoragecapacity() {
		return storagecapacity;
	}
	public void setStoragecapacity(int storagecapacity) {
		this.storagecapacity = storagecapacity;
	}
	
	

}
