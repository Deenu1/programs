package aggregation;

public class AggreAddr {

	String address;
	AggreStudent a;
	public AggreAddr(String address,AggreStudent a)
	{
		
		this.address=address;
		this.a=a;
	}
	public void display()
	{
		System.out.println("Address:"+address);
		System.out.println(a.name+" "+a.rollnum);
	}
	
	
	public static void main(String[] args) {
		
		AggreStudent obj=new AggreStudent("Jan",30);
		AggreAddr o=new AggreAddr("Jan,Jan Villa,Trvm",obj);
		o.display();
	}

}
