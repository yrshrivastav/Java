import java.util.Scanner;
class Round1
{
	public static void main(String[] args)
	{
		
		
		int j = 0;
		int [] ar = new int[args.length];
		for( int i=0; i<args.length; i++)
		{
			ar[i] = Integer.parseInt(args[i]);
			//int[] ar={Integer.parseInt(args[i])}; we can take it in single line in this style
		}
		
		int n = ar.length;
		int size = n-1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter from which position you want change");
		int pos = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Given array is: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(ar[i]+ " ");
		}
		

		for (int i = n-1; i>=pos-1; i--)
		{
			arr[j] = ar[i];
			j++;
		}
		/*System.out.println("\nNew array is: ");
		for(int i=0; i<pos; i++)
		{
			System.out.print(arr[i]+ " ");
		}*/


		for (int i=pos-1; i>0; i--)
		{
			ar[size] = ar[i-1];
			size--;
		}
		/*System.out.println("\nUpdated array is: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(ar[i]+ " ");
		}*/

		for(int i=0; i<n-(pos-1); i++)
		{
			ar[i] = arr[j-1];
			j--;
		}
		System.out.println("\nChanged array is: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(ar[i]+ " ");
		}
		
	}
}