class Solution {
    public int[] findErrorNums(int[] nums) {

        Set<Integer>seen = new HashSet<>();

        int missing = -1;
        int duplicate = -1;

        for(int num: nums){
            if(seen.contains(num)){
                duplicate = num;
            }else{
                seen.add(num);
            }
        }

        for(int i = 1; i<= nums.length; i++){
            if(!seen.contains(i)){
                missing = i;
                break;
            }
        }

        return new int[] {duplicate, missing};
        
    }
}