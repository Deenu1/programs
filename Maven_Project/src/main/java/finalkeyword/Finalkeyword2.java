package finalkeyword;

public class Finalkeyword2 extends Finalkeyword1{
public final void method2() {              //method cannot Override
	System.out.println("Final keyword:");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword2 o=new FinalKeyword2();
		o.method2();
	}

}
