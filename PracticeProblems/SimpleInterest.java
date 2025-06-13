import java.util.Scanner;

public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle amount:");
		Double Principle = sc.nextDouble();
		System.out.println("Enter the interest rate:");
                Double Rate = sc.nextDouble();
		System.out.println("Enter the desired Time:");
                Double Time = sc.nextDouble();

		Double SimpleInterest = (Principle*Rate*Time)/100;
		System.out.println("The simple interest calculated is:" +SimpleInterest);
	}
}
