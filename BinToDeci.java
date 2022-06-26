import java.lang.*;
import java.util.*;

class BinToDeci{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the binary number that needs to be converted : ");
		
		sc.useRadix(2); 

		int decimalNumber = sc.nextInt();

		System.out.println(decimalNumber);

	}
}