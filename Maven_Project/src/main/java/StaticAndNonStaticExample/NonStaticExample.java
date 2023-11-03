package StaticAndNonStaticExample;

public class NonStaticExample {
	String name="Jan";
	public void candName() {
		System.out.println("The candidate Name is:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticExample o=new NonStaticExample();
		o.candName();
	}

}
