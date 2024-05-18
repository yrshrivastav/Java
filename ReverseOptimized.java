//   <=..........Program to reverse using Scanner class...........=>

import java.util.Scanner;
class ReverseOptimized
{
	public static void main(String[] args)
	{

		int i, temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of elements to be stored in array: ");
		int size = scan.nextInt();
		int ar[] = new int[20];
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<size;i++)
		{
    			ar[i] = scan.nextInt();
		}
		
		//int len = ar.length;
		//int len = size;
		
		//int n= len-1;     to reduce space we can take len-1 instead of n...
		int n= size-1;    //since there is no use of ar.length so we can take size directly and also instead of taking n we can use size-1 too...
		
		System.out.println("Given array is: ");
		for(i=0; i<size; i++)
		{
			System.out.print(ar[i]+ " ");
		}
		for (i = 0; i<size/2; i++)
		{
			
			temp=ar[i];
			ar[i]=ar[n-i];
			ar[n-i]=temp;
			
		}
		System.out.println("\nReversed array is: ");
		for(i=0; i<size; i++)
		{
			System.out.print(ar[i]+ " ");
		}
	}
}