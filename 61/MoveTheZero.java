class MoveTheZero
{
	public static void main(String args[])
	{	
		int a[] = {0,1,0,1,0,1,0,0,0,1,1,1};
		int num = 0;
		for(int i=0;i<a.length;i++)
			if(a[i] == 0)
			{
				a[num] = a[i];
				num++;
			}
		for(int i = num;i<a.length;i++)
		
			a[i] = 1;
			
		for(int i:a)
		System.out.print(i + "  ");
	}
}	
