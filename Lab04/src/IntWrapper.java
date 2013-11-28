import java.util.Scanner;

public class IntWrapper {

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num1;
		String num2;
		int maxVal;
		int minVal;
		String dec1;
		String dec2;
		int dec3;
		int dec4;
		int sum;
		
		System.out.print("Please enter in an integer:");
		num1 = scan.nextInt();
		num2 = Integer.toBinaryString(num1);
		System.out.println("The integer in binary: " + num2);
		num2 = Integer.toOctalString(num1);
		System.out.println("The integer in octal: " + num2);
		num2 = Integer.toHexString(num1);
		System.out.println("The integer in hexadecimal: " + num2);
		
		maxVal = Integer.MAX_VALUE;
		System.out.println("The maximum java integer value is " + maxVal);
		minVal = Integer.MIN_VALUE;
		System.out.println("THe minimum java integer value is " + minVal);
		
		System.out.print("Enter in 2 decimal integers");
		dec1 = scan.next();
		dec2 = scan.next();
		
		dec3 = Integer.parseInt(dec1);
		dec4 = Integer.parseInt(dec2);		
		
		sum = (dec3 + dec4);
		
		System.out.println("The sum of those two integers is " + sum);
		
				
	}
}
	