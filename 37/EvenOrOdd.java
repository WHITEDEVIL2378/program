class EvenOrOdd
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,52,4,2,43,4,3,434,4};
		int evencount,oddcount;
		evencount = 0;oddcount = 0;
		for(int i:a)
		{
				if(i%2==0)
				evencount++;
				else
				oddcount++;
		}
		System.out.println("Even number count " + evencount);
		System.out.println("Odd number count " + oddcount);		
	}
}

		
