import java.util.Scanner;
class sumArray
{
	public static void main(String arg[])
	{
		int a[]; 
		a = new int [5];
		Scanner s = new Scanner (System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		} 	
		int sum = 0;
		for(int i:a)
		{
			sum += i; 		
		}
		System.out.println(sum);
	}
}
