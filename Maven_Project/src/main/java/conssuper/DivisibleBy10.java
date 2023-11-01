package conssuper;

public class DivisibleBy10 extends AdditionResult{
	int c;
	public DivisibleBy10(int a, int b) {
        super(a,b);
    }
	public boolean isDivisibleBy10() {
        if (c % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

public static void main(String[] args) {
	
	DivisibleBy10 obj=new DivisibleBy10(100,200);
	//System.out.println(obj.getResult());
	System.out.println(obj.isDivisibleBy10());
	}

}
