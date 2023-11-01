package Exception;

public class ExceptionExampleNullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	String str=null;

int length=str.length();
System.out.println("String Length"+length);
	}
catch(NullPointerException n) {
	System.out.println("Null pointer exception ocurred"+n);
}
}
}