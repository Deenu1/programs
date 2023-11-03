package polymorphism;

public class BMW extends Car{
	public void start() {    
		System.out.println("BMW Start");
	}
	public void refuel() {
		System.out.println("Refuel");
	}
	

//method overriding==same method in parent and child class with same name and arguments
//eg::start()  Car & BMW classes
public static void main(String[] args) {
	// TODO Auto-generated method stub
	//Static polymorphism = Compile time polymorphism
BMW obj=new BMW();
obj.start();
obj.stop();
obj.refuel();


}

}