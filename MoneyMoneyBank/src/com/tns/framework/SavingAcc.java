package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;
	private static final float MINBAL=1000;
	
	public float getAccBal() {
		return accBal;
	}
	
	
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
	}

	public void withdraw(float accBal) {
		System.out.println("Account balance is:" +accBal);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
