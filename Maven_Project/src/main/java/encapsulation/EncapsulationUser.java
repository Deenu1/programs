package encapsulation;
import java.util.Scanner;
public class EncapsulationUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EncapsulationATM obj=new EncapsulationATM();
		System.out.println("Enter your PIN:");
		int pin=sc.nextInt();
		obj.setter(1234);
		System.out.println("Enter the amount:");
		int amount=sc.nextInt();
		obj.getter();
	}

}
