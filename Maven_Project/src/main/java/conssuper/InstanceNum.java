package conssuper;

public class InstanceNum extends InstanceAdd  {
	public void display()
	{
		super.addNum();
		System.out.println("hiii"+super.x);
	}

	public static void main(String[] args) {
		
		InstanceNum O=new InstanceNum();
		O.display();
		//O.addNum();
		
	}

}
