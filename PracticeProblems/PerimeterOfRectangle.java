import java.util.Scanner;

public class PerimeterOfRectangle
{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length:");
		Double Length = sc.nextDouble();
		System.out.println("Enter the Width");
		Double Width = sc.nextDouble();

		Double Perimeter = 2*(Length+Width);
		System.out.println("The Desired perimeter is:" +Perimeter);
	}
}
