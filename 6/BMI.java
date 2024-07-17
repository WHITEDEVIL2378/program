class BMI
{
	public static void main(String args[])
	{
		double p = 452;
		double inches = 72;
		double kilo = p/2.2046;
		double meter = inches * 0.0254;
		System.out.println("Body mass index is " + p/(inches*inches)*703);
		System.out.println("Body mass index is " + kilo/(meter*meter));
	}
}
