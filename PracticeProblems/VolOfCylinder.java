import java.util.Scanner;
public class VolOfCylinder{
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the desired radius:");
                double radius = scan.nextDouble();
                System.out.println("Enter the desired height:");
                double height = scan.nextDouble();
                double Volume = 3.14*(Math.pow(radius,2))*height;
                System.out.println("the Volume of is :" +Volume);
        }
}

