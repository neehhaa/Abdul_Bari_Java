import java.lang.*;
import java.util.*;

class KeybRead{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int num1, num2, sum;
		
		System.out.println("Enter First Number : ");
		num1 = s.nextInt();
		
		System.out.println("Enter Second Number");
		num2 = s.nextInt();

		sum = num1 + num2;

		System.out.println("Sum is : "+sum);	
	
	}
}