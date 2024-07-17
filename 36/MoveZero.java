class MoveZero
{
	public static void main(String args[])
	{
		int a[] = {1,2,0,0,3,0,6,2,0,0};
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			continue;
			else
			{
				int j = i;
				while(j<a.length)
				{
					if(a[j]!=0)
					{
						int temp = a[j];
						a[j] = a[i];
						a[i] = temp;
						count = 1;
					}
					j++;
				}
			}	
			if(count == 1)
				for(int k=i;k>=1;k--)
				{
					if(a[k]<a[k-1])
					{
						int temp2 = a[k];
						a[k] = a[k-1];
						a[k-1] = temp2;
					}
				}
			count = 0;
		 }
		for(int i:a)
		System.out.print(i+ " ");
	}
}

