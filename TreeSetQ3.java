import java.util.*;
class TreeSetQ3
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator());
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));

		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
	}
}