package Interface;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HSBCBank hb=new HSBCBank();
hb.credit();
hb.dedit();
hb.transferMoney();
hb.educationLoan();
hb.carLoan();

USBank o=new HSBCBank();  //interface name obj name=new class name();
o.credit();
o.dedit();
o.transferMoney();

	}

}
