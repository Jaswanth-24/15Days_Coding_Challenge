public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int sum=nums[0],maxsum=nums[0];
        if(nums.length<2){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
}