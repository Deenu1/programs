
public class DiscountCalculator1 {

public static void main(String[] args) {
	        double itemPrices[] = {3000, 2500, 1200, 800, 900};
	        double totalAmnt = totalAmnt(itemPrices);
	        double finalAmnt = discount(totalAmnt);
			

	        System.out.println("Total Amount: $" + totalAmnt);
	        System.out.println("Final Amount after discount:$" + finalAmnt);
	    }

	    
	    public static double totalAmnt(double itemPrices[]) {
	        double total = 0;
			double price=6000;
	        
	            total= price+total;
	        
	        return total;
	    }

	    
	    public static double discount(double totalAmnt) {
	        if (totalAmnt > 5000) {
	            
	            double discount = 0.20 * totalAmnt;
	            return totalAmnt - discount;
	        } else {
	            return totalAmnt;
	        }
	    }
	}