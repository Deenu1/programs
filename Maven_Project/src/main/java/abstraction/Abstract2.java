package abstraction;

public class Abstract2 extends AbstractExamp1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract2 obj=new Abstract2();
		obj.method();
		obj.add();
	}
	@Override
public void add() {
	System.out.println("Abstract Method");
}
}