class DuplicateString
{
	public static void main(String args[])
	{
		String a[] = {"water","air","fire","air","fire"};
		int k = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				k = 0;
				if(a[i].charAt(k)!=a[j].charAt(k))
				continue;
				else if(a[i].length()!=a[j].length())
				continue;
				else
				{
					while(k<a[i].length())
					{
						if(a[i].charAt(k) != a[j].charAt(k))
						break;
						k++;
					}
				}
			}
			//System.out.println(k);
			if(k == a[i].length())
			System.out.println(a[i] + "  ");
		}
	}
}
				
