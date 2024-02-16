package com.Emaples.geomerty;

public class Customer {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("989", "John");
		System.out.println(account.withdrawMoney(200));
		account.depositMoney(400);
		account.withdrawMoney(500);

	}

}
