package abstractionbank;

public class HDFCBank extends Bank{
	public void loan() {
		System.out.println("HDFC Bank---loan");  
		
	}
	public void fund() {
		System.out.println("HDFC Bank---fund");  
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
HDFCBank hb=new HDFCBank();
hb.loan();
hb.fund();
hb.credit();
hb.debit();
	}

}
