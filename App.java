
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception  {
        
        double radius=0; 
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius= sc.nextDouble();

        CircleWithException  c = new CircleWithException(radius);
        System.out.println("Area of circle: "+ c.getArea());
        

    }

    
}
