package Exception;

public class ExceptionExampleThrows {
	public void  CandElig() throws IOException{
	
		int age=33;
		
			if(age>=18)
			{
				System.out.println("Eligible for Driving liscence");
			}
			else
			{
				throw new ArithmeticException("hello");
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExampleThrows obj=new ExceptionExampleThrows();
		obj.CandElig();
	}

}
