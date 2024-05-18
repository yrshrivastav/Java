//   <=..........Program to reverse using Command Line Arguments...........=>

class ReverseOpt1
{
	public static void main(String[] args)
	{

		int i, temp;
		int [] ar = new int[args.length];
		for( i=0; i<args.length; i++)
		{
			ar[i] = Integer.parseInt(args[i]);
			//int[] ar={Integer.parseInt(args[i])}; we can take it in single line in this style
		}	
		int len = ar.length;
		//int len = size;
		
		int n= len-1;     //to reduce space we can take len-1 instead of n...
		//int n= size-1;    since there is no use of ar.length so we can take size directly and also instead of taking n we can use size-1 too...
		
		System.out.println("Given array is: ");
		for(i=0; i<len; i++)
		{
			System.out.print(ar[i]+ " ");
		}
		for (i = 0; i<len/2; i++)
		{
			
			temp=ar[i];
			ar[i]=ar[n-i];
			ar[n-i]=temp;
			
		}
		System.out.println("\nReversed array is: ");
		for(i=0; i<len; i++)
		{
			System.out.print(ar[i]+ " ");
		}
	}
}