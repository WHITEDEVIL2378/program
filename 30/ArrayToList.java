import java.util.ArrayList;
class ArrayToList
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		
		for(int i:a)
		a1.add(i);

		System.out.println(a1);
	}
}
