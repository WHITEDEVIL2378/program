class PerfectDigit
{
	public static void main(String args[])
	{
		int a = 1;
		System.out.println(Digits(a));
	}
	public static int  Digits(int a)
	{
		int res = 10 - a;
	 	a *= 10;
	 	return a+res;
	}
}
