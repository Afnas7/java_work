package java_work.day_2;

public class Day_2_Classwork {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantity=3;
		int price=275;
		int discount=10;
		
		double total=(double)price*quantity;
		double discount_double=(double)discount;
		
		double discountAmount = total * (discount/ 100);
	    double finalBill = total - discountAmount;
	    
	    System.out.println("Quantity           : " + quantity);
        System.out.println("Price per Book     : " + price);
        System.out.println("Total Amount       : " + total);
        System.out.println("Discount (%)       : " + discount);
        System.out.println("Discount Amount    : " + discountAmount);
        System.out.println("Final Bill Amount  : " + finalBill);

	}
}
