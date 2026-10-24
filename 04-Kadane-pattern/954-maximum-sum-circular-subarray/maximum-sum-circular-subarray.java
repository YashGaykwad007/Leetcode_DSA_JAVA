class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int bestEnding = nums[0];
        int res = nums[0];
        int total = nums[0];
        for (int i = 1; i < n; i++) {
            bestEnding = Math.max(nums[i], bestEnding + nums[i]);
            res = Math.max(res, bestEnding);
            total += nums[i];
        }
        // for the circular integer array use totalsum - minsubarray = maxsubarray
        int minEnding = nums[0];
        int minsum = nums[0];
        for(int i =1;i<n;i++){
            minEnding = Math.min(nums[i],minEnding+nums[i]);
            minsum = Math.min(minsum,minEnding);//act as minSubarray
        }
        if(res<0){
            return res;//if all the element are neagtive than the total - minsubbarray return 0
        }
        res = Math.max(res,total-minsum);// final res update
        return res;
    }
}