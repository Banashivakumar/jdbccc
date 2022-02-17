package com.xworkz.digital_wallet.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.digital_wallet.dao.DigitalWalletDAOImpli;
import com.xworkz.digital_wallet.dto.DigitalWalletDTO;

public class TestDigitalWallet {

	public static void main(String[] args) {
		
		DigitalWalletDTO digitalWalletDTO = new DigitalWalletDTO();
		digitalWalletDTO.setWallet_Id(1);
		digitalWalletDTO.setProviderName("Gpay");
		digitalWalletDTO.setAvailableBalance(456);
		digitalWalletDTO.setNoOfTransction(34);
		
		
		DigitalWalletDTO digitalWalletDTO1 = new DigitalWalletDTO();
		digitalWalletDTO1.setWallet_Id(2);
		digitalWalletDTO1.setProviderName("phonepay");
		digitalWalletDTO1.setAvailableBalance(345);
		digitalWalletDTO1.setNoOfTransction(67);
		
		
		
		DigitalWalletDTO digitalWalletDTO2 = new DigitalWalletDTO();
		digitalWalletDTO2.setWallet_Id(3);
		digitalWalletDTO2.setProviderName("paytm");
		digitalWalletDTO2.setAvailableBalance(987);
		digitalWalletDTO2.setNoOfTransction(67);
		
		List<DigitalWalletDTO> walletdto = new ArrayList<DigitalWalletDTO>();
		walletdto.add(digitalWalletDTO);
		walletdto.add(digitalWalletDTO1);
		walletdto.add(digitalWalletDTO2);
		
		DigitalWalletDAOImpli walletDAOImpli = new DigitalWalletDAOImpli();
		walletDAOImpli.addWalletInBatch(walletdto);
		
		
		
		

	}

}
