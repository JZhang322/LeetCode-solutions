class Solution {
    public int[] runningSum(int[] nums) {
  
        for(int i=nums.length-1; i>0; i--) {
            
            int j = i-1;
            while(j>-1) {
                nums[i]=nums[i]+nums[j];
                j--;
            }
         
    }
        return nums;
}
}