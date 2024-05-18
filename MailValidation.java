import java.util.regex.*;
class MailValidation
{
	public static void main(String[] args)
	{	
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(args[0]);
		if (m.find() && m.group().equals(args[0]))
		{
			System.out.println("Valid Mail Id");
		}
		else
		{
			System.out.println("InValid Mail Id");
		}
	}	
}