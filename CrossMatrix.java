class CrossMatrix
{
	public static void main(String args[])
	{
		int a[][]= {{1,2,3,4},
				 {4,5,6,7},
				 {7,8,9,9},
				 {10,11,12,13}};
		int left = 0; int top = 1;
		while(left<a[0].length)
		{
			for(int i = left;i>=0;i--)
			{	
				System.out.print(a[left-i][i] + "  ");
			}
			left++;
			System.out.println();
		}
		left--;
		while(top<a.length)
		{
			for(int i = top;i<a.length;i++)
			{	
				System.out.print(a[i][left--] + "  ");
			}
			left = a[0].length - 1;
			top++;
			System.out.println();
		}
	}
}
			
			
