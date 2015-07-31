public class Bicycle {
/*
	//State
	int gear=3;

	//Behaviour
	public void setGear(int newGear){
		gear = newGear;
	}

	public int getGear(){
		return gear;
	}

	public static void main(String[] args){
		Bicycle myBicycle = new Bicycle();
		System.out.println("Current gear is: " + myBicycle.getGear() );
		myBicycle.setGear(5);
		System.out.println("New gear is: " + myBicycle.getGear() );
	}
*/

	//state
	int gear = 1;

	//behaviour
	public void setGear(int newGear){
		gear = newGear;
	}
	public static void main(String[] args){
		Bicycle myBicycle = new Bicycle();
		System.out.println("new set gear is: " + newGear);
	}

	
}