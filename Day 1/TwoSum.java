import java.util.HashMap;

public class TwoSum {
    public static int[] twosum(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x =target-nums[i];
            if(map.containsKey(x) && map.get(x)!=i ){
                return new int[]{i,map.get(x)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target = 9;
        int[] res=twosum(nums,target);
        for(int i:res){
            System.out.println(i);
        }
    }
}
