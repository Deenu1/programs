package encapsulation;

public class EncapsulationATM {
private int pin;
public void setter(int pin) {
	this.pin=pin;
	
}
public void getter() {
	if(pin==1001) {
		System.out.println("PIN IS VALID"+pin);
	}
	else if(pin==1234) {
		System.out.println("PIN IS VALID"+pin);
	}
	else if(pin==1212) {
		System.out.println("PIN IS VALID"+pin);
	}
	else{
		System.out.println("PIN IS INVALID");
	}
}
}
