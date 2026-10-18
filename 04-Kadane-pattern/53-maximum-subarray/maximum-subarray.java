class Solution {
    public int maxSubArray(int[] nums) {
        int BestEnding = nums[0];
        int ans = nums[0];
        // in this we have two step for each
        for(int i=1;i<nums.length;i++){
            int v1 = BestEnding+nums[i];// the value at current i add to the previous one
            int v2 = nums[i];// the value at current i ko kudh liya jayega
            BestEnding = Math.max(v1,v2);// dono mai se best answer dekhna padhega
            ans = Math.max(ans,BestEnding);
        }
        return ans;
    }
}