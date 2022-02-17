package com.xworkz.digital_wallet.dao;

import java.util.List;

import com.xworkz.digital_wallet.dto.DigitalWalletDTO;

public interface DigitalWalletDAO {
	
	public int addWalletInBatch(List<DigitalWalletDTO> wallets) ;
		
	

}
