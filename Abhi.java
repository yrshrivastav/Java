public class Abhi {
    public static void main(String[] args) {
        int num[]={0,1,2,3,4,5};
        int result[]=new int[num.length];
        int a=num[0];
        int c=0,j=0,c1=0;
        for(int i=0;i<num.length;i++){

            if(a==num[i]){
                if(c<2){
                    result[j]=a;
                    c1++;
                    j++;
                    // System.out.println(a);
                    c++;
                }
            }
            else{
                c=0;
                a=num[i];
                i--;
            }
        }
        System.out.println("k="+c1);
        for (int i=0;i<c1;i++) {
                System.out.print(result[i]+" ");
        }
    }
}
