class secondLargest
{
	public static void main(String arg[])
	{
		int a[] = {2,4,3,52,2,4,2,4,55,1};
		int fmax=a[0],smax=a[0];
		for(int i:a)
		{
			if(i>fmax)
			{
				smax= fmax;
				fmax = i;
			}
			else if(i<fmax&&i>smax)
			{
				smax = i;
			}
		}
		System.out.println(smax); 
	}
}
