import java.io.Console;

class BankApp{


	public static void main(String[] args){

	//System.out.println("Hello World");

	// Assign Variables
	int principal;
	float rate;
	int term;

	// User Input
	Console con = System.console();
	String choice1 = con.readLine("Enter an investment amount: ");
	principal= Integer.parseInt(choice1);
	String choice2 = con.readLine("Enter and investment rate: ");
	rate = Float.parseFloat(choice2);
	String choice3 = con.readLine("Enter term in years: ");
	term= Integer.parseInt(choice3);



	// Calculation
	// formula I = P X R X T
	// formula Total Value = I + P
	float interest = principal * rate * term;
	float invValue = interest + principal;

	//Output Results	
	System.out.println("\nyour Interest Earned was: " + interest);
	System.out.println("your Investment Value is: " + invValue);



	}


}