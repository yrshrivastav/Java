import java.io.*;
import java.util.regex.*;
class ListTextFile
{
	public static void main(String[] args)
	{	
		int count = 0;
		Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.]txt");
		File f = new File("D:\\");
		String [] s = f.list();
		for (String s1 : s)
		{	
			Matcher m = p.matcher(s1);
			if (m.find() && m.group().equals(s1))
			{
				System.out.println(s1);
				count++;
			}
		}
		System.out.println("The total no of java/class files are: "+count);
	}	
}