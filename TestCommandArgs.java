public class TestCommandArgs 
{

	public static void main(String[] args) 
	{
		
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		System.out.println("n: "+n +" m: "+m); 
		for (int i=0; i<args.length; i++)
			{
				System.out.println(args[i]);
			}
		
	
		/*int arg[]={'a', 20, 30};
		args=arg;
		for(int str=0; str<arg.length; str++){
			System.out.println(arg[str]);
			}  */	
}
}
