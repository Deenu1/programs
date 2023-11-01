package ExcelProgram;
import java.io.IOException;
public class ExcelMain {

	public static void main(String[] args) throws IOException{
		
String y=ExcelCode.getStringData(1,1);
System.out.println(y);
String e=ExcelCode.getIntegerData(1,0);
System.out.println(e);
	}

}
