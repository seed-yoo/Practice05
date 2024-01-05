package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account() {
		super();
	}

	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}

	public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	// 필요한 메소드 작성
	public String getAccountNo() {
		return accountNo;
	}
	
	public void deposit(int balance) {
		this.balance += balance;
	}

	public void withdraw(int balance) {
		this.balance -= balance;
	}
	public void showBalance() {
		System.out.println(balance);
	}
	
	

}
