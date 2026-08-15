class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer>map = new HashMap<>();


        for(int num1: nums1){
            map.put(num1, map.getOrDefault(num1, 0) +1);
        }

        ArrayList<Integer>arr = new ArrayList<>();

        for(int num2: nums2){
           
            if(map.containsKey(num2)){
                
                arr.add(num2);
                map.put(num2, map.get(num2) -1);

                if(map.get(num2) == 0){
                    map.remove(num2);
                }
                
            }
        }

        int[] a = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            a[i] = arr.get(i);
        }

        return a;
    }
}