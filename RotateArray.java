class RotateArray{
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        rotateArray(ar,-5);
    }
    public static void rotateArray(int[] ar, int step){
        if(step<0){
            step = (step+ar.length);
        }
        for(int i=0; i<step; i++){
            int temp= ar[ar.length-1];
            for(int j=ar.length-1; j>0; j--){
                ar[j]=ar[j-1];
            }
            ar[0]= temp;
        }
        for (int i : ar) {
            System.out.print(i+" ");
        }
    }
}