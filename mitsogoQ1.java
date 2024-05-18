class mitsogoQ1{

    public static int calculateMaxProfit(int[] uniqueId, int[] profit){
        int maxProfit = 0;
        int i = 0;
        while (i < uniqueId.length) {
            if(profit[i]>0){
            int currentProfit = profit[i];
            while (i < uniqueId.length - 1 && uniqueId[i] == uniqueId[i + 1]) {
                currentProfit = Math.max(currentProfit, profit[++i]);
            }
            maxProfit += currentProfit;
        }
            i++;
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
            int uniqueid[] ={1,2,2};
            int profit[] = {-10,20,30};
            int sum=calculateMaxProfit(uniqueid, profit);
            System.out.println(sum);
        }
}
