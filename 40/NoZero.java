class NoZero
{
	public static void main(String args[])
	{
		int a [] = {1,2,3,4,5,1,3};
		for(int i:a)
		{
			if(i <= 0)
			{
				System.out.println("The array contains 0 and -1 ");
				return;
			}
		}
		System.out.println("The array doesn't contain 0 and 1");
	}
}
