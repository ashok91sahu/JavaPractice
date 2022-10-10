
public class Cardetails {

	public static void main(String[] args) {
		car bmw=new car("sports", 14, 500000);
		car audi=new car("qulinan", 12, 800000);
	
		bmw.startcar();
		bmw.carstopped();
		bmw.cardetails();
		
		audi.startcar();
		audi.carstopped();
		audi.cardetails();

	}

}
