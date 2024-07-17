class maxMin
{
	public static void main(String arg[])
	{
		int a[] = {1,7,11,1,5,9,3,0};
		int max = a[0];
		int min = a[0];
		for(int i:a)
		{
			if(i>max)
			max = i;
			if(i<min)
			min = i;
		}
		System.out.println(max + " " + min);
	}
} 
