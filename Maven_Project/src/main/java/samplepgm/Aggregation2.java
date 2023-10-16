package samplepgm;

public class Aggregation2 {
	String name,place;
	Aggregation1 a;
	public Aggregation2(String name,String place,Aggregation1 a)
	{
		this.name=name;
		this.place=place;
		this.a=a;
	}
	public void display()
	{
		System.out.println("name:"+name+" "+"place:="+place );
		System.out.println(a.id+" "+a.name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj=new Aggregation1("Trvm",100);
		Aggregation2 o=new Aggregation2("Anu","Auh",obj);
		o.display();
	}

}
