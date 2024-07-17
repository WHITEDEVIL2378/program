class removeElement
{
	public static void main(String args[])
	{	
		int target = 8;
		int index = 0;
		int a[] = {1,2,34,8,3,5};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			index = i;
		}
		for(int i=index;i<a.length-1;i++)
		{
			a[i] = a[i+1];
		}
		a[a.length-1] = 0;
		for(int i:a)
		System.out.print(i+ " ");
	}
}
		
