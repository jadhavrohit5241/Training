package com.te.java.exception;

public class Bank {
	long balance;
	public Bank(long a) {
		this.balance=a;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank(2000);
		try {
			bank.withdraw(100000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
	
	
	public void withdraw(long a) {
		long aa=0;
		if (this.balance>=a) {
			aa=(this.balance-a);
			System.out.println("Amount withrow succesfully");

			System.out.println("your acc blance is "+aa);
		}
		else {
			
			throw new Customexception("hey man pls ern and then spend");
		}
		
	}

}
