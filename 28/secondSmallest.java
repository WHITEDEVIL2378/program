class secondSmallest
{
	public static void main(String arg[])
	{
		int a[] = {2,4,3,52,2,4,2,4,55,1,0,-1};
		int fmin=a[0],smin=a[0];
		for(int i:a)
		{
			if(i<fmin)
			{
				smin= fmin;
				fmin = i;
			}
			else if(i<fmin&&i>smin)
			{
				smin = i;
			}
		}
		System.out.println(smin); 
	}
}
