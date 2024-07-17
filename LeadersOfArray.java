class LeadersOfArray
{
	public static void main(String args[])
	{
		int a[] = {2,4,6,2,6,1,234,1,4,2};
		Leaders(a);	
	}
	public static void Leaders(int a[])
	{
		System.out.println("The Leaders in the array");
		for(int i = 0;i<a.length-1;i++)
		{
			if(a[i] > a[i+1])
			{
				System.out.print(a[i] + " ");
			}
		}
		System.out.print(a[a.length-1]);
	}
}
				
		
