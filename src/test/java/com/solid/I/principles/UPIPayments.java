package com.solid.I.principles;


//Interface Segregation Principle (ISP)
//The principle states that the larger interfaces split into smaller once.
//Because the implementation classes use only the methods that are required. We should not force the
//client to use the methods that they do not want to use.
//The goal of the interface segregation principle is similar to the single responsibility principle. 
public interface UPIPayments {

	public void payMoney();

	public void getScrachCard();

}
