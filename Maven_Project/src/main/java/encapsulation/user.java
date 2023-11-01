package encapsulation;
import java.util.Scanner;
public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
ATM atm=new ATM();
System.out.println("Enter your PIN:");
int userPin=sc.nextInt();
atm.setPin(userPin);
System.out.println("Enter the amount:");
int amount=sc.nextInt();
atm.withdrawMoney(amount);
	}

}
