class Solution {
    public int[] findErrorNums(int[] nums) {

        boolean[] bool = new boolean[nums.length +1];

        int[] ans = {0, 0};

        for(int n: nums){

            if(bool[n] == true)
                ans[0] = n;
            else
                bool[n] = true;
        }

        for(int i = 1 ; i<= nums.length; i++){

            if(bool[i] == false){
                ans[1] = i;
            }
        }

        return ans;
        
    }
}