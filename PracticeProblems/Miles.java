import java.util.Scanner;

public class Miles
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the distance in kilometers:");
		Double KM = scan.nextDouble();

		System.out.println("kilometers to miles:" +(KM*0.621371));
	}
}
