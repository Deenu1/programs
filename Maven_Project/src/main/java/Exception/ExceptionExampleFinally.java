package Exception;

public class ExceptionExampleFinally {
	public void method() {
		try {
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("Welcome to JAVA"+e);
		}
		finally {
			System.out.println("hii");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExampleFinally obj=new ExceptionExampleFinally();
		obj.method();
	}

}
