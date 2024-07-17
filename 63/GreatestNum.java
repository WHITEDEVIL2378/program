class GreatestNum
{
	public static void main(String args[])
	{
		int a[] = {3,6,1,7,3,5};
		int i = 1;
		while(i<a.length)
		{
			a[i-1] = a[i];
			int j = i;
			while(j<a.length)
			{
				if(a[i]<a[j])
				{
					a[i] = a[j];
					a[i-1] = a[j];
				}
					j++;
			}
			//System.out.print(a[i-1] + " ");
			i++;
		}
		a[a.length-1] = -1;
		for(int g:a)
		System.out.print(g + " ");
	}	
}

