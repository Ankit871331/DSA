class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer>map = new HashMap<>();

        for(int x: arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        Set<Integer> set = new HashSet<>();

        for(int y: map.values()){
            if(!set.add(y)){
                return false;
            }
        }

        return true;
    }
}