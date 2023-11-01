package collections;
import java.util.*; 
public class Collection1 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>(); //Creating arraylist   
		list.add("Deenu");//Adding object in arraylist  
		list.add("Hessa");  
		list.add("Jan");  
		System.out.println(list);  
		ArrayList<Integer> obj=new ArrayList<Integer>(); //Creating arraylist   
		obj.add(10);//Adding object in arraylist  
		obj.add(20);  
		obj.add(30);  
		System.out.println(obj);
		Iterator a=obj.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		list.remove(3);
		System.out.println(list);
		System.out.println(obj.contains(40));
		System.out.println(obj.get(1));
		System.out.println(obj.size());
		obj.removeAll(obj);
		System.out.println(obj);
	}  
		}  
