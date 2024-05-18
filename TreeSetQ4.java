import java.util.*;
class TreeSetQ4
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator());
		
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add("AA");
		t.add(new StringBuffer("XX"));
		t.add("ABCD");
		t.add(new StringBuffer("A"));

		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		if (s1.length() < s2.length())
			return -1;
		else if (s1.length() > s2.length()) 
			return +1;
		else
			return s1.compareTo(s2);
	}
}