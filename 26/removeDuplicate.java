class removeDuplicate
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,4,3,2,3};
		int b[] = new int [a.length];
		for(int i:a)
		{
			if(b[i]<1)
			b[i]++;
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i] == 1)
			System.out.print(i + " ");
		}
	}
}
