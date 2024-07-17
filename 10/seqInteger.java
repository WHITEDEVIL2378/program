class seqInteger
{
	public static void main(String ar[])
	{
		int a =213321;
		String res ="";
		while(a!=0)
		{
			int temp = a%10;
			res =temp + " " + res;
			a/=10;
		}
		System.out.println(res);
	}
}
