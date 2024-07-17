class copy
{
	public static void main(String ar[])
	{
		int a[] = {1,2,3,4,5};
		int b[] = new int [a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		for(int i:b)
		System.out.println(i + " ");
	}
}
		
