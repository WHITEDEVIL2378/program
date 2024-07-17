class AvgArray
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6,7,344};
		int max = a[0];
		int min = a[0];
		int sum = 0;
		for(int i:a)
		{
			if(i>max)
			max = i;
			if(i<min)
			min = i;
		}
		for(int i:a)
		{
			if(i == max || i == min)
			continue;
			else
			sum += i;
		}
		
		float avg = (float) sum/(a.length-2);
		System.out.println("The avg of the array without the largest and smallest is " + avg );
	}
}
