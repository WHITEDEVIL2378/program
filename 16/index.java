class index
{
	public static void main(String arg[])
	{
		int target = 8;
		int a[] = {1,2,3,4,8,8,6,5,3};
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == target)
			{
				System.out.println("The element is present in the index " + i);
				return;
			}
		}
		System.out.println("The element is not present");
	}
}
