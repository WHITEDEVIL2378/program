import java.util.Scanner;
class sumOfDigits
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the digits between 0 to 1000");
		int num = s.nextInt();
		if(num>1000)
		{
			System.out.println("Invalid input");
			return;
		}
		int sum = 0;
		int temp = num; 
		while(temp!=0)
		{
			int r = temp%10;
			sum += r;
			temp /=10;
		}
		System.out.println("Sum of all digits in " + num + " is " + sum );
	}
}
