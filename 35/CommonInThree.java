class CommonInThree
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		int b[] = {2,3,4,5};
		int c[] = {1,2,3,4};
		int j = 0;
		int k = 0;
		int i = 0;
		while(i<c.length)
		{
			while(j<b.length&&k<a.length)
			{
				if(c[i]==b[j] && c[i] == a[k])
				{
					System.out.println("Common element " + a[i]);
					j++;
					k++;
					break;
				}
				else if(c[i] == b[j] && c[i] != a[k])
				{
					k++;
				}
				else if(c[i] == a[k] && c[i] != b[j])
				{
					j++;
				}
				else
				{
					k++;
					j++;
				}
			}
			k = 0;
			j = 0;
			i++;
		}
	}
}
