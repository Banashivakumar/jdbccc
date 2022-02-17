package com.xworkz.mobile.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dto.MobileDTO;

public class RunnerClass {
	
	public static void main(String[] args) {
	
		MobileDTO mobileDTO=new MobileDTO();
		mobileDTO.setBrandName("apple");
		mobileDTO.setModelName("apple12pro");
		mobileDTO.setPrice(3500);
		mobileDTO.setRam((byte)8);
		mobileDTO.setStoragecapacity(24);
		
		MobileDTO mobileDTO2=new MobileDTO();
		mobileDTO2.setBrandName("blackberry");
		mobileDTO2.setModelName("balckkk");
		mobileDTO2.setPrice(23466);
		mobileDTO2.setRam((byte)4);
		mobileDTO2.setStoragecapacity(32);
		
		MobileDTO mobileDTO3=new MobileDTO();
		mobileDTO3.setBrandName("redmi");
		mobileDTO3.setModelName("redminote5");
		mobileDTO3.setPrice(34545);
		mobileDTO3.setRam((byte)6);
		mobileDTO3.setStoragecapacity(64);
		
		
		
		MobileDAO mobileDAO2=new MobileDAO();
		mobileDAO2.updateMobileStorageCapacityByBrandName(mobileDTO);
		System.out.println(mobileDTO);
		
		List<MobileDTO> mobiledto = new ArrayList<MobileDTO>();
		mobiledto.add(mobileDTO);
		mobiledto.add(mobileDTO2);
		mobiledto.add(mobileDTO3);
		
		mobileDAO2.insertMobiles(mobiledto);
	
		
		
	}

}
