class StairCase
{
	public static void main(String args[])
	{
		int n = 5;
		int i = 1;
		int j = 2;
		int sum = 1;
		while(sum<=n)
		{		
			sum += i;
			System.out.print(i + " ");	
		}
		sum = 1;
		System.out.println();
		if(n%2==0)
		{
			while(sum <= n)
			{
				sum += j; 
				System.out.print(j + " ");
			}
		}
		System.out.println();
		sum = 1;	
		for(int l = 1;l<n;l++)
		{
			for(int k = 1;k<n;k++)
			{
				if(l==k)
				{
					if(sum<=n)
					{
						sum += j;
						System.out.print(j + " ");
					}
				}
				else
				{
					if(sum<=n)
					{
						sum += i;
						System.out.print(i + " ");
					}
				}
			}
			sum = 1;
			System.out.println();
			for(int e = 1;e<n;e++)
			{
				if(l==e)
				{
					if(sum<=n)
					{
						sum += i;
						System.out.print(j + " ");
					}
				}
				else
				{
					if(sum<=n)
					{
						sum += j;
						System.out.print(i + " ");
					}
				}
			}
			sum = 1;
			System.out.println();
		}
	}
}
