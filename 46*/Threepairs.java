class ThreePairs
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6,7,1};
		int target = 6;
		for(int i=0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				for(int k = j+1;k<a.length;k++)
				{
					if(a[i] + a[j] + a[k] == target)
					System.out.println("[" + a[i] +","+a[j]+","+a[k]+"]");
				}
			}
		}
	}
}
