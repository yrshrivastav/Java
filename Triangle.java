class Triangle
{
	public static void main(String [] args)
	{	
		//Program to print ttraingle using *
		for(int i=5; i>0; i--)
		{
		//System.out.println(" ");
			for(int j=1; j<=i; j++)
			{
				System.out.print("  ");
				
				for(int k=1; k<=j; k++)
				{
					System.out.println(" * ");
				}
			}
		//System.out.println("  ");
		}
	}
}