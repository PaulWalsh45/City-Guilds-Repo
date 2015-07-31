
public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Car myCar = new Car("Ford","Mustang", "Red", 1.2F);
		Car myCar = new Car();
		Car hisCar = new Car("Opel", "Vectra", "Silver", 2.0F);
				myCar.setMake("Ford");
				myCar.setModel("Mustang");
				myCar.setcolour("Black");
				myCar.setEngineSize(2.8F);
				
		myCar.printDetails();
		/*System.out.println(myCar.getMake());
		System.out.println(myCar.getModel());
		System.out.println(myCar.getColour());
		System.out.println(myCar.getEngineSize() + "L");
		System.out.println(hisCar.make + " " + hisCar.model + " " + hisCar.colour + " "+ hisCar.engineSize + "L");
		*/
		
		
	}
	
	
		
}
