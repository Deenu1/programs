package abstraction;

public class InterfacePgm implements InterfaceExample{
	public void print() {
		System.out.println("Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InterfacePgm obj=new InterfacePgm();//get class and interface methods
		InterfaceExample obj=new InterfacePgm();//only interface methods
		obj.addNum();
		obj.subNum();
		//obj.print();

	}
public void addNum() {
	int c=a+b;
	System.out.println(c);
}
public void subNum() {
	int c=a-b;
	System.out.println(c);
}
public void addNum1()
{
	System.out.println("Interface Example 1");
	}
}

