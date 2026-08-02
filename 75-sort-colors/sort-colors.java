class Solution {
    public void sortColors(int[] nums) {
        int low =0, mid = 0, high = nums.length -1;


        while(mid <= high){
        switch(nums[mid]){

            case 0:
                int temp0 = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp0;
                low++;
                mid++;
                break;

            case 1:
                mid++;
                break;

            case 2:
                int temp2 = nums[high];
                nums[high] = nums[mid];
                nums[mid]  =temp2;
                high--;
                break;
                
        }
            
        }
    }
}