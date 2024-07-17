class SumOfTens
{
	public boolean Sum(int a[],int target)
	{
		int sum = 0;
		for(int i:a)
		{
			if(i<=9)
			continue;
			else
			sum += i;
		}
		if(sum == target)
		return true;
		else
		return false;
	}
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,4,3,15,15,10};
		int target = 30;
		SumOfTens e = new SumOfTens();
		System.out.println(e.Sum(a,target));
	}
}			
