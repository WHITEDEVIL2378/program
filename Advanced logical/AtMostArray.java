class AtMostArray
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,1,5,6,1};
		System.out.println(AtMost(a));
	}
	public static boolean AtMost(int a[])
	{
		int count = 0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				a[i+1] = a[i];
				count++;
			}
		}
		//7System.out.print(count);
		if(count > 1)
		return false;
		else
		return true;
	}
}
