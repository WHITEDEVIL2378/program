class Equality
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		int b[] = {2,3,5,4,1};
		int c[] = new int [a.length];
		int count = 0;
		if(a.length!=b.length)
		{
			System.out.println("Not equal");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i] == b[j])
				c[i]++;
			}
			if(c[i] == 1)
			count++;
		}
		if(count == a.length)
		System.out.println("Equal");
		else
		System.out.println("Not equal");
	}
}
		
