import java.util.Scanner;
class calculation
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Sum " + (a+b) + "Difference " + Math.abs(a-b) + "Product " + a*b + "Distance " + Math.abs(a-b) + "Average " + (a+b)/2 + "Max " + (a>b?a:b) + "Min " + (a<b?a:b));
	}
} 
		
		 
