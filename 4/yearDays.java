import java.util.Scanner;
class yearDays
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of minutes");
		int min = s.nextInt();
	System.out.println(min+" minutes is approximately "+min/(365*24*60)+" years and "+(min%(365*24*60))/(24*60)+" days");
	}
}
		
