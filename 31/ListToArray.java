import java.util.ArrayList;
class ListToArray
{
	public static void main(String args[])
	{
		ArrayList<Integer> w = new ArrayList<Integer>();
		w.add(23);
		w.add(2);
		w.add(3);
		w.add(1);
		w.add(22);
		int a[] = new int [w.size()];
		for(int i=0;i<w.size();i++)
		a[i] = w.get(i);
		for(int i:a)
		System.out.print(i+ " ");
	}
}
