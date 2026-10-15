class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer>map = new HashMap<>();

        for(int x: nums1){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        List<Integer>list = new ArrayList<>();
        for(int y: nums2){
            if(map.getOrDefault(y, 0) > 0){
                list.add(y);
                map.put(y, map.get(y)-1);
            }
        }

        int[] arr = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            arr[i] = list.get(i);
        }


    return arr;
        }
    }
