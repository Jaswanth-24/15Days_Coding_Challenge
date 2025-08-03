import java.util.Arrays;

class LC238{
    public static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        result[0]=1;
        int prefix=1,suffix= 1;
        for(int i=1;i< nums.length;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        for (int i = nums.length-2; i>=0; i--){
            suffix*=nums[i+1];
            result[i]*=suffix;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int [] ans=productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
}
