public class SelectionSort {
    public static void main(String[] args) {
        int ar[] = {7,8,3,1,2};
        // int ar[] = {9,2,3,8,5};

        System.out.println("Given Array : ");
        //Calling Print Array Method
        printArray(ar);

        //Calling Selection Sort Method 
        ar=selectionSort(ar);

        System.out.println("Sorted Array using SelectionSort : ");
        //Calling Print Array Method
        printArray(ar);
    }
    //Time Complexity O(n^2)
    //Selection Sort Method
    public static int[] selectionSort(int ar[]){
        //My Approach
         for(int i=0; i<ar.length-1; i++){
            int smallest = ar[i];
            for(int j=i+1; j<ar.length; j++){
                
                if(ar[i]>ar[j]){
                    smallest = ar[j];
                    int temp = ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }
                
            }
        }
    
        //Tutor Approach
    /*    for(int i=0; i<ar.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<ar.length; j++){
                
                if(ar[smallest]>ar[j]){
                    smallest = j;
                }  
            }
            int temp = ar[smallest];
            ar[smallest]=ar[i];
            ar[i]=temp; 
        }
    */
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
