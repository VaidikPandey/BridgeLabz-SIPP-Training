import java.util.Scanner;
public class Conversion{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celsius:");
		double Celsius = scan.nextDouble();
		double Fahrenheit = (Celsius*9/5)+32;
		
		System.out.println("The given temperature in Fahrenheit:" +Fahrenheit);
	}
}
