import java.util.Scanner;
class speed
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("input distance in meters");
		float d = s.nextFloat();
		System.out.println("input distance in hours");
		int h = s.nextInt();
		System.out.println("input distance in minutes");
		int m = s.nextInt();
		System.out.println("input distance in seconds");
		int sec = s.nextInt();
		double e = h+(m/60.0)+((sec/60.0)/60.0);
		System.out.println("Your speed in meters/second is " + d/(h*60*60+m*60+sec));
		System.out.println("Your speed in km/hr is " + (d/1000)/e);
		System.out.println("Your speed in m/hr is " + (d/1609)/e);
	}
}
		
