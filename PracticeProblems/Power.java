import java.util.Scanner;

public class Power{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the base:");
		Double base = scan.nextDouble();
		System.out.println("enter the exponent");
		Double exponent = scan.nextDouble();

		System.out.println("the Power is :" +(Math.pow(base,exponent)));
	}
}
