class StairCases
{
	public static void main(String args[])
	{
		int n = 5;
		System.out.println(climbStairs(n));
	}
	public static int climbStairs(int n)
	{
		int ways[] = new int [n+1];
		ways[0] = 1;
		ways[1] = 1;
		for(int i = 2;i<=n;i++)
		{
			ways[i] = ways[i-1] + ways[i-2];
		}
		return ways[n];
	}
}
		
