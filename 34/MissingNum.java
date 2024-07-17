class MissingNum
{
	public static void main(String args[])
	{	
		int a[] = {0,11};
		int k = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(++k != a[i])
			{
				System.out.println(k);
				if(k<a[i])
				{
					i--;
			}
		}
	}
}
