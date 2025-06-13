import java.util.Scanner;

public class Average
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the three number");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
  		double num3 = scan.nextDouble();

		System.out.println("the average of three numbers is:" +(num1+num2+num3)/3);
	}
}
