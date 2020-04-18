import java.util.*;
class ArrayList3
{
	public static void main(String args[])
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rohan");
		a.add("Moha");
		a.add("Sohan");
		ListIterator<String> list1 = a.listIterator(a.size());
		while(list1.hasPrevious())
		{
			String str = list1.previous();
			System.out.println(str);
		}
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		a.forEach(x->System.out.println(x));
		Iterator<String> itr = a.iterator();
		itr.forEachRemaining(x->System.out.println(x));
		
	}
}