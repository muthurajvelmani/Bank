package org.bank.login;
//by using inheritance with extends keyword: here hdfc is child and  Mydetais is parent class
public class HdfcBank extends MyDetails {
	private void accountNo() {
		System.out.println("account no is 12355444jhgff456789");
	}
	private void ifscNo() {
	    System.out.println("ifsc no is 753951458525858759848484848486852");
	}
private void branch() {
	 System.out.println("gdu");
}
public static void main(String[] args) {
	HdfcBank nl=new HdfcBank();
	nl.accountNo();
	nl.ifscNo();
    nl.branch();
    nl.accountType();
    nl.panNo();
    nl.accountNumber();
    
}   

}

