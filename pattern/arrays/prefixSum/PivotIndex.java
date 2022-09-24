class PivotIndex {
    public int pivotIndex(int[] nums) {
        int ls = 0;
        int rs = 0;
        for(int i = 1; i < nums.length; i++) {
            rs += nums[i];
        }
        
        if(ls == rs) 
            return 0;
        
        for(int i = 1; i < nums.length; i++) {
            ls += nums[i-1];
            rs -= nums[i];
            
            if(ls == rs)
                return i;
        }
        return -1;
    }
}
