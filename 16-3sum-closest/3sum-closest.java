class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0]+ nums[1] + nums[2];
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            int left = i +1;
            int right = n -1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target){
                    closest = sum;
                    return closest;
                }
               else if(Math.abs(sum - target) < Math.abs(closest - target)){
                    closest = sum;

                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closest;
    }
}