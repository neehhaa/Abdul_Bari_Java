
import java.util.*;

class TriArea{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Height in cm : ");
		
		float height = sc.nextFloat();
		
		System.out.println("Enter the base length in cm : ");
		float base = sc.nextFloat();
		 
		float area =((1.0f/2)*(base*height));
		
		System.out.println("Area of the triangle is : "+ area + " sq. cm " );
		
	
		
		
	}
}