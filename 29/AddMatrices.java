class AddMatrices
{
	public static void main(String args[])
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int sum[][] = new int [a[0].length][b[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		for(int i[]:sum)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
