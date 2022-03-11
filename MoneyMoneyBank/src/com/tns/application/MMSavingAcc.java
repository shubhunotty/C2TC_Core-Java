package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float MINBAL=1000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
	}
	
		
	public void withdraw(float accBal) {
		System.out.println("Your Balance is: "+accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
}
