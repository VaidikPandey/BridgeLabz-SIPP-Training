import java.util.Scanner;
class Addition{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first number");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number");
		double num2 = scan.nextDouble();
		double sum = num1 + num2;
	        System.out.println("The sum is:"+sum);
	}
}

