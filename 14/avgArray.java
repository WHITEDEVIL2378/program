class avgArray
{
	public static void main(String ar[])
	{
		int a[] = {5,5,5,5,5,5,5};
		int sum = 0;
		float avg = 0;
		for(int i:a)
		 sum+=i;
		avg = sum / a.length; 
		 System.out.println(avg);
	}
}
