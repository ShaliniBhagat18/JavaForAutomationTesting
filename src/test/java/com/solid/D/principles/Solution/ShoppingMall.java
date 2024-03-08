package com.solid.D.principles.Solution;
import com.solid.D.principles.DebitCard;


public class ShoppingMall {
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);
	}
	
	public static void main(String args[]) {
		//DebitCard debitCard = new DebitCard();
		
		BankCard bankCard = (BankCard) new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchaseSomething(5000);
	}
	
	

}
