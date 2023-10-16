package polymorphism;

public class Poly2 extends Poly1{
	public void num(int x)
	{
		super.num(100);
		System.out.println("hey");
		
	}
	

	public static void main(String[] args) {
		
		Poly2 o=new Poly2();
		o.num(20);
	}

}
