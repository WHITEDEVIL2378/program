class DiffofLargest
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6,7,344};
		int max = a[0];
		int min = a[0];
		for(int i:a)
		{
			if(i>max)
			max = i;
			if(i<min)
			min = i;
		}
		System.out.println("The difference between two numbers is " + (max-min));
	}
}
