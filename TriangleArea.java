import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float x,y,z,s;
		System.out.println("Enter length of each side : ");
		
		x = sc.nextFloat();
		y = sc.nextFloat();
		z = sc.nextFloat();
		
		s = (x+y+z)/2;
		
		
		double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));	
		
		System.out.println(area);

	}

}
