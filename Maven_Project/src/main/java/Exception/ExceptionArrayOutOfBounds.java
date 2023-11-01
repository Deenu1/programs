package Exception;

public class ExceptionArrayOutOfBounds {
	public void method() {
		
			int a[]= {1,2,3,4};
			try {
			System.out.println(a[5]);
			}
			catch(Exception w) {
		    System.out.println("Exception handled"+w);
			}
		
			//catch(ArrayIndexOutOfBoundsException d){
			 //System.out.println("Welcome"+d);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionArrayOutOfBounds obj=new ExceptionArrayOutOfBounds();
		obj.method();
	}

}
