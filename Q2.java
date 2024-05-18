public class Q2 {
	
	static int firstnumber;
	static int secondnumber;
	int sum;
	int diff;
	int mul;
	int div;
	
	
	public Q2(){
	}
		
	//static block
		static{
			firstnumber = 50;
			secondnumber = 25;
		}
		
		//instance block for Addition
		{
			sum = firstnumber+secondnumber;
		}
		
		//instance block for subtraction
		{
			diff = firstnumber - secondnumber;
		}
		
		//instance block for multiplication
		{
			mul = firstnumber * secondnumber;
		}
		
		//instance block for division
		{
			div = firstnumber / secondnumber;
		}
		
		
	public static void main(String[] args) { 
		//Addition
		Q2 add = new Q2();
		System.out.println("Sum of (first) " + firstnumber + " and (second) " + secondnumber + " number is : " + add.sum );
		
		//Subtraction
		Q2 sub = new Q2();
		System.out.println("Difference of (first) " + firstnumber + " and (second) " + secondnumber + " number is : " + sub.diff );
		
		//Product
		Q2 prod = new Q2();
		System.out.println("Product of (first) " + firstnumber + " and (second) " + secondnumber + " number is : " + prod.mul );
		
		//Division
		Q2 div = new Q2();
		System.out.println("Division of (first) " + firstnumber + " and (second) " + secondnumber + " number is : " + div.div );
	}		
}