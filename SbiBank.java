package org.bank.login;
//inheritance with extands keyword: here sbibank is a child and Mydetails is a parent class
public class SbiBank extends MyDetails {
	public void accountNo() {
		System.out.println("ac no is 7418*******963");
	}
public void ifscNo() {
	  System.out.println("ifsc no is 369125816547");
}
public void branch() {
	 System.out.println("branch is tbm-gdu");
}
public static void main(String[] args) {
	SbiBank sbi= new SbiBank();
	sbi.branch();
	sbi.ifscNo();
	sbi.panNo();
	sbi.accountNo();
    
}
}
