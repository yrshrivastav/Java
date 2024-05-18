
class Reverse
{
	public static void main(String[] args)
	{
		int ar[] = {2,3,5,1,7};
		int i, j, temp;
		int n = ar.length;
		System.out.println("Given array is: ");
		for(i=0; i<n; i++)
		{
			System.out.print(ar[i]+ " ");
		}
		for (i = 0; i<n/2; i++)
		{
			for(j=n-1; j>i; j--)
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				i++;
			}
		}
		System.out.println("\nReversed array is: ");
		for(i=0; i<n; i++)
		{
			System.out.print(ar[i]+ " ");
		}
	}
}