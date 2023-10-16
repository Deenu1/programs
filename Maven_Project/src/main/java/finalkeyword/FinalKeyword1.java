package finalkeyword;

public class FinalKeyword1 {
final int x=10;
public void method() {
	System.out.println(x);
}
public final void method2() {
	System.out.println("Final Keyword:");
}
	public static void main(String[] args) {
		
		FinalKeyword1 o=new FinalKeyword1();
		o.method();
	}

}
