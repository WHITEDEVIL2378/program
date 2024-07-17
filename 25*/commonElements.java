class commonElements
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,3,3,4,5,6,6};
		int b[] = {2,2,2,2,2,3,5,6};
		for(int i = 0;i<a.length;i++)
		{
			if(i!=0)
			{
				if(a[i] == a[i-1])
				{
					i++;
					continue;
				}
			}
				for(int j=0;j<b.length;j++)
				{
					if(a[i] == b[j])
					{
						System.out.print(a[i] + " ");
						break;
					}
				} 
		}
	}
}		
