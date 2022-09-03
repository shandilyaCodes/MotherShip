package binarySearch;

/**
* This implementation does two things, first it finds whether an element is present in an ascending array or not
* Second, if the given element is not present, it also finds the appropriate place where we can place the element
* Second usecase is basically returning low instead of -1; TC : O(log n)
*/
public class BinarySearch {
    public static void main(String[] args) {
       int[] nums = {1, 3, 5, 6};
        int index = findTarget(nums, 7, 0, nums.length-1);
        System.out.println(index);
    }

    private static int findTarget(int[] nums, int target, int low, int high) {
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target)
                return mid;

            if (nums[mid] < target) {
                // Search in right
                return findTarget(nums, target, ++mid, high);
            } else if (nums[mid] > target){
                // Search in left
                return findTarget(nums, target, 0, --mid);
            }
        }
        return low;
    }
}
