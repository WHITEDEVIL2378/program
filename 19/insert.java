import java.util.Scanner;
class insert
{
	public static void main(String arg[])
	{
		int target = 9;
		int index = 2;
		int size = 5;
		size++;
		int a[] = new int [size];
		a[0] =1;
		a[1] =2;
		a[2] =3;
		a[3] =4;
		a[4] =5;
		for(int i = a.length-1;i>index;i--)
		{
			a[i] = a[i-1];
		}
		a[index] = target;
		for(int i:a)
		 System.out.println(i);
	}
		
}
