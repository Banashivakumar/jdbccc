package com.xworkz.creditcard.tester;

import com.xworkz.creditcard.dao.CreditCardDAO;
import com.xworkz.creditcard.dao.CreditCardDAOImpli;
import com.xworkz.creditcard.dto.CreditCardDTO;

public class CardTester {
	
	public static void main(String[] args) {
		
		CreditCardDTO creditCardDTO = new CreditCardDTO();
		creditCardDTO.setCardId(1);
		creditCardDTO.setCardNumber(123456);
		creditCardDTO.setExpiryDate("12/12/22");
		creditCardDTO.setCardHolderName("akanksha");
		creditCardDTO.setNfcEnabled(false);
		
		CreditCardDTO creditCardDTO2 = new CreditCardDTO();
		creditCardDTO2.setCardId(2);
		creditCardDTO2.setCardNumber(456767);
		creditCardDTO2.setExpiryDate("21/12/27");
		creditCardDTO2.setCardHolderName("vandy");
		creditCardDTO2.setNfcEnabled(true);
		
		CreditCardDTO creditCardDTO3 = new CreditCardDTO();
		creditCardDTO3.setCardId(3);
		creditCardDTO3.setCardNumber(59876);
		creditCardDTO3.setExpiryDate("05/4/28");
		creditCardDTO3.setCardHolderName("bana");
		creditCardDTO3.setNfcEnabled(true);
			
		CreditCardDTO creditCardDTO4 = new CreditCardDTO();
		creditCardDTO4.setCardId(4);
		creditCardDTO4.setCardNumber(98787);
		creditCardDTO4.setExpiryDate("25/8/25");
		creditCardDTO4.setCardHolderName("spoo");
		creditCardDTO4.setNfcEnabled(false);
		
		CreditCardDAO creditCardDAO = new CreditCardDAOImpli();
		creditCardDAO.saveCard(creditCardDTO);
		creditCardDAO.saveCard(creditCardDTO2);
		creditCardDAO.saveCard(creditCardDTO3);
		creditCardDAO.saveCard(creditCardDTO4);
	}

}
