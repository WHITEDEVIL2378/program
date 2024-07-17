class zigzag
{
	public static void main(String args[])
	{	
		String s = "thisisazigzag";
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<s.length();j++)
			{
				if(j<i)
				System.out.print(".");
				if(i==j)
				System.out.print(s.charAt(i-1));
				else if(j == (s.length()/2 - i ) + 1  || j == (s.length()/2 + i ) - 1)
				System.out.print(s.charAt(j-1));
				else
				System.out.print(" ");
				if(i+j == s.length())
				System.out.print(s.charAt((i+j) - i));
			}
			System.out.println();
		}
	}
}		   
