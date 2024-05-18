public class Q3 {
	
	static float bar;
	static float psi;
	static float kPa;
	
	

	public static void main(String[] args) {
		// UNITS - [psi, bar, kPa]

		
		// 1- psi <---> bar
		psi = 24f;
		psitobar();
		System.out.println("Air pressure in bar from psi is : " +bar);
		
		// 2- psi <---> kPa
		psitokPa();
		System.out.println("Air pressure in kPa from psi is : " +kPa);
		
		// 3- bar <---> kPa
		bartokPa();
		System.out.println("Air pressure in kPa from bar is : " +kPa);
		
	    

	}
	// Method1
	// 1- psi <---> bar
	static float psitobar() {
		bar = psi * 0.06894f;
		return bar;
	}
	
    //Method2
	// 2- psi <---> kPa
	static float psitokPa() {
		kPa = psi * 6.89475f;
		return kPa;
	}
	
	//Method3
	// 3- bar <---> kPa
	static float bartokPa() {
		kPa = bar * 100;
		return kPa;
	}
}
