public class BubbleSort {
    public static void main(String[] args) {
        int ar[] = {7,8,3,1,2};

        System.out.println("Given Array : ");
        //Calling Print Array Method
        printArray(ar);

        //Calling Bubble Sort Method 
        ar=bubbleSort(ar);

        System.out.println("Sorted Array using BubbleSort : ");
        //Calling Print Array Method
        printArray(ar);
    }
    //Time Complexity O(n^2)
    //Bubble Sort Method
    public static int[] bubbleSort(int ar[]){
        int n= ar.length-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        return ar;
    }
    //Print Array Method
    public static void printArray(int ar[]){
        for (int i : ar) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
