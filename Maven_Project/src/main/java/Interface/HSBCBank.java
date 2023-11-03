package Interface;

public class HSBCBank implements USBank,IndianBank {   //multiple interfaces //Is a relationship
	public void credit(){   //US Bank method
		System.out.println("hsbc credit");
		
	}
	public void dedit(){
		System.out.println("hsbc dedit");
		
	}
	public void transferMoney(){
		System.out.println("hsbc transferMoney");
		
	}
	public void educationLoan(){
		System.out.println("hsbc educationLoan");
		
	}
	public void carLoan(){
		System.out.println("hsbc carLoan");
		
	}
	public void mutualFund(){  //Indian Bank method
	System.out.println("hsbc mutualFund");
		
}
}
