package encapsulation;

public class ATM {
	private int pin;
	private int validPins[]= {1001,1234,1212};
	public void setPin(int pin)
	{
		this.pin=pin;
	}
public boolean validatePin() {
	if(validPins==pin) 
	{
		return true;}
	else
	{
			return false;
	}
}
public void withdrawMoney(int amount) {
	if(amount>0)
	{
		System.out.println("Withdraw"+amount);
	}
	else
	{
		System.out.println("Invalid amount"+amount);
	}
}

}
