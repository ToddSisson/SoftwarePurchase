package num4;
import java.text.DecimalFormat;
import java.util.Scanner;
public class SoftwareProgram {

	public static void main(String[] args) {
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		Scanner userInput = new Scanner(System.in);
		System.out.print("How many copies of software would you like to purchase? ");
		Software s1 = new Software(userInput.nextInt());
		
		System.out.println("The price of the software is $" + dollar.format(s1.calculatePrice()));

		
		userInput.close();
	}

}
