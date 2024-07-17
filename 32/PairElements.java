class PairElements
{
	public static void main(String args[])
	{
		int a[] = {2,3,5,6,4,1,3,4};
		int target = 6;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == target)
			{
				continue;
			}
			for(int j=0;j<a.length;j++)
			{	
				if(j!=target)
				{
					if(a[i] + a[j] == target)
					System.out.println("The pairs are [" + a[i] + "," + a[j] + "]");
				}
			}
		}
	}
}
				
