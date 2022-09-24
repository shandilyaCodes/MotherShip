class PartitionArrayIn3EqualParts {
    public boolean canThreePartsEqualSum(int[] arr) {
        int part = 0;
        int sum = Arrays.stream(arr).sum();
        int avg = sum/3;
        int count = 0;
        
        for(int a : arr) {
            part += a;
            if(part == avg) {
                ++count;
                part = 0;
            }
        }
        
        return count >= 3 && sum % 3 == 0;
    }
}
