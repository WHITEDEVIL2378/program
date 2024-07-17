class duplicateArray
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,2,3,4,12,3,45,3,12};
		int count = 0;
		int k = 0;
		int max = a.length;
		int b[] = new int [max];
		for(int i=0;i<a.length;i++)
		{
			/*if(a[i] > max)
			{
				max = a[i];
				b = new int [max];	
			}*/
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					k = a[i];
					if(b[k] != 1)
					b[k]++;
				}
			}
		}
		for(int i:b)
		System.out.print(i + " ");
		
		/*for(int w = 0;w<b.length;w++)
		{
			if(b[w] == 1)
			System.out.print(w + " ");
		}*/
	}
}




































/*int b[] = new int [25];
		for(int i = 0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i] == a[j])
				{
					k = a[i]; 
					if(b[k]!=1)
					b[k]++;
				}
			}
			//System.out.print(k + " ");
			//System.out.print(b[k] + " ");
			k=0;
		}
		//for(int t=0;t<b.length;t++)
		//{
		//	if(b[t] == 1)
		//	System.out.print(t + " ");
		for(int e:b)
		System.out.print(e + " " );
*/
