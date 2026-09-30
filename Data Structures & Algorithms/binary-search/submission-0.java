class Solution {
    public int search(int[] nums, int target) {

           return value(nums,0,nums.length-1,target);
    }

     public static int value(int a[], int low, int high, int target) {
        
        if(low <=high){
        int mid = low + (high - low) / 2;

        if (a[mid] == target) {

            return mid;
        } else if (a[mid] < target) {

            return value(a, mid + 1, high, target);
        } else {
            return value(a, 0, mid - 1, target);

        }
        }
        else{
        return -1;
        }

        // return -1;
    }
}
