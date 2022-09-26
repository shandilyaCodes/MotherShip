class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        LinkedHashSet<Integer> present = new LinkedHashSet<>();
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == k)
                present.add(i);
        }
        
        count += present.size();
        
        int track = 0;
        
        for(Integer i : present) {
            if(hasSum(nums, k, track, i-1))
                count++;
            track = track + i + 1;
        }
        return count;
    }
    
    private boolean hasSum(int[] nums, int sum, int start, int end) { 
        if(start == end)
            return sum == nums[start];
        int targetSum = 0;
        for(int i = start; i <= end; i++) {
            targetSum += nums[i];
        }
        return sum == targetSum;
    }
}
