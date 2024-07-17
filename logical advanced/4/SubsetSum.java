class SubsetSum
{
	public static void main(String args[])
	{
		int a[] = {5,10,15,20,25,30,35};
		SubsetSum s = new SubsetSum();
		System.out.println(s.Sum(a));	
	}		
	public boolean Sum(int a[])
	{
		int i = 0;
		int j = a.length-1;
		int sum = 0;
		int temp = 0;
		int k = 0;
		while(i<j)
		{	
			while(i<j)
			{
				temp += a[i];
				i++;
			}
			k = j;
			while(k<a.length)
			{
				sum += a[k];
				k++;
			}	
			System.out.println(temp);	
			if(sum == temp)
			return true;
			temp = 0;
			sum = 0;
			j--;
			i = 0;
		} 
		return false;
	}
}
