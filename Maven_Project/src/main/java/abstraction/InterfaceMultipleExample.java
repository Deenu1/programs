package abstraction;

public class InterfaceMultipleExample implements InterfaceExample,InterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMultipleExample obj=new InterfaceMultipleExample();
		obj.addNum();
		obj.subNum();
		obj.addNum1();
		
	}
public void addNum() {
	System.out.println("hello");
	}
public void subNum() {
	System.out.println("hiii");
}
public void addNum1() {
	System.out.println("welcome");
}
}
