import java.util.*;
class TreeSetQ2
{
	public static void main(String[] args)
	{
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}