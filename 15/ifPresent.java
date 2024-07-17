class ifPresent
{
	public static void main(String args[])
	{
		int target = 8;
		int a[] = {1,2,3,8,5};
		for(int i:a)
		{
			if(i==target)
			{	
				System.out.println("The element is present");
				return;
			}
		}
		System.out.println("The element not present");
	}
}
