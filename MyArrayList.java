import java.util.*;

class MyArrayList 
{
	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0;i<x;i++)
			arr.add(i);
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);
		Iterator itr = arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(int obj:arr)
			System.out.println(obj);
		
	
		
	}
}
		