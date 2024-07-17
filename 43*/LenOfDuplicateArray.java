class LenOfDuplicateArray
{
	public static void main(String args[])
	{
		int a[] = {20,20,30,40,40,50,50,50};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				a[j] = 0;
			}
		}
		int count = 0;
		for(int i:a)
		{
			if(i>0)
			count++;
		}
		System.out.println(count);
	}
}
	
