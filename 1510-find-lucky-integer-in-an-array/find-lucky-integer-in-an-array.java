class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int Arr: arr){
            map.put(Arr, map.getOrDefault(Arr, 0) +1);
        }

    int luckyNo = -1;

    for(int i : map.keySet()){
        if((map.containsKey(i)) && map.get(i) == i){
            luckyNo = i;
        }
    }
        return luckyNo;
    }
}