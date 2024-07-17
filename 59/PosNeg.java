class PosNeg
{
	public static void main(String args[])
	{
		int a[] = {-1,2,-2,-5,5,-3,5,-34,7};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				int j = i+1;
				while(j<a.length)
				{
					if(a[j]>0)
					{
						int temp = a[j];
						a[j] = a[i];
						a[i] = temp;
					}
					j++;
				}
			}
		System.out.print(a[i] + " ");
		}
	}
}
