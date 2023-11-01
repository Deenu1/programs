package collections;

import java.util.ArrayList;
import java.util.List;


public class InterfaceList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj=new ArrayList<Integer>(); //Creating list   
	obj.add(10);
	obj.add(20);
	obj.add(30);
	obj.add(40);
	System.out.println(obj);
	for(int a:obj) {
		System.out.println(a);
	}
	}

}
