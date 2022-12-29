package org.bank;
//single inheritance
public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Minimum deposit will be 5000");
	}
	public static void main(String[]args) {
		AxisBank a = new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();
	} 
}
