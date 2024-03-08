package com.solid.O.principles;

//Open-Closed Principle (OCP)
// The open-closed principle states that according to new requirements the module
// should be open for extension but closed for modification

public interface NotificationService {
	
	public void sendOTP(String medium);
	
	public void sendTransactionReport(String medium);
	

}
