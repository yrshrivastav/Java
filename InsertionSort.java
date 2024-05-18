public class InsertionSort {
    public static void main(String[] args) {
        int ar[] = {7,8,3,1,2};
        // int ar[] = {9,2,3,8,5};

        System.out.println("Given Array : ");
        //Calling Print Array Method
        printArray(ar);

        //Calling Our Insertion Sort Method 
        // ar=insertionSort(ar);

        //Calling Our Insertion Sort Method
        ar=insertionSortTutor(ar);

        System.out.println("Sorted Array using InsertionSort : ");
        //Calling Print Array Method
        printArray(ar);
    }

    //Time Complexity O(n^2)
    //Insertion Sort Method
    //My Approach
    public static int[] insertionSort(int ar[]){
        
        for(int i=0; i<ar.length-1; i++){
            for(int j=i+1; j<ar.length; j++){
                if(ar[i]>ar[j]){
                    int temp = ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }    
            }
        }
        return ar;
    }

    //Insertion Sort Method
    //Tutor Approach that is right in context of insertion sort
    public static int[] insertionSortTutor(int ar[]){
        
        for(int i=0; i<ar.length; i++){
            int current = ar[i];
            int j=i-1;
            while(j>=0 && current<ar[j]){
                    ar[j+1]=ar[j];
                    j--; 
            }
            //placement
            ar[j+1]=current; 
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
