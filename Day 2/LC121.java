class LC121 {
    public static int maxProfit(int[] a){
        int buy=a[0],profit=0;
        for(int i=1;i<a.length;i++){
            if(buy>a[i]){
                buy=a[i];
            }
            else if ((a[i]-buy)>profit){
                profit=a[i]-buy;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
