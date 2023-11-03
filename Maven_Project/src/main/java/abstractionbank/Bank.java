package abstractionbank;

public abstract class Bank {
	public abstract void loan();   //abstract method
		
	public void credit() {    //Non abstract method
		
		System.out.println("Bank---Credit");  
	}
	public void debit() {
		System.out.println("Bank---Debit");  
	}
}
