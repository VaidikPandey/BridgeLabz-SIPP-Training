import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the desired radius:");
		double radius = scan.nextDouble();
		double area = 3.14*(Math.pow(radius,2));
		System.out.println("the area of circle is :" +area);
	}
}
