class RunningSum {
    public int[] runningSum(int[] nums) {
        int prev = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] = prev + nums[i];
            prev = nums[i];
        }
        return nums;
    }
}
