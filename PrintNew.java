class PrintNew
{
	public static void main(String[] args)
	{
		int row = Integer.parseInt(args[0]);
		//int column = Integer.parseInt(args[1]);
		System.out.println("Number of entered row: "+row);
		//System.out.println(column);
		for(int i=1; i<=row; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" * ");
			}
		System.out.println();
		}
	} 
}
