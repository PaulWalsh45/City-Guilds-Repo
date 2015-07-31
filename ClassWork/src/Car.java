
public class Car {
	
	// state, (instance variables)
	private String make;
	private String model;
	private String colour;
	private float engineSize;
	
	public Car(){
		
	}
	
	public Car(String make, String model, String colour,float engineSize){
		// this. refers to the instance variables
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.engineSize = engineSize;
	}
	// behaviour 
	//setters
	public void setMake(String newMake){
		make = newMake;
	}
	
	public void setModel(String newModel){
		model = newModel;
	}
	
	public void setcolour(String newColour){
		colour = newColour;
	}
	
	public void setEngineSize(float newEngineSize){
		engineSize = newEngineSize;
	}
	
	// getters
	public String getMake(){
		return make;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColour(){
		return colour;
	}
	
	public float getEngineSize(){
		return engineSize;
	}

	public void printDetails() {
		System.out.println(this.make);
		System.out.println(this.model);
		System.out.println(this.colour);
		System.out.println(this.engineSize + "L");
		//System.out.println(myCar.getEngineSize() + "L");
		//System.out.println(hisCar.make + " " + hisCar.model + " " + hisCar.colour + " "+ hisCar.engineSize + "L");
		
	}
	
	
	
	
	
	
}

