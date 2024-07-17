class Present65And77
{
	public static void main(String args[])
	{
		boolean res = false;
		boolean res1 = false;
		int a[] = {1,2,3,65,7,77,8};
		for(int i:a)
		{
			if(i==65)
			res = true;
			else if(i==77)
			res1 = true;
		}
		System.out.println("Wether the elements are present " + (res && res1));
	}
}
