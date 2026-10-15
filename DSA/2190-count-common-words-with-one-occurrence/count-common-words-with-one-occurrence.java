class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer>map = new HashMap<>();
        HashMap<String, Integer>map2 = new HashMap<>();
        for(String word1: words1){
            map2.put(word1, map2.getOrDefault(word1, 0)+1);
        }

        for(String word2: words2){
            map.put(word2, map.getOrDefault(word2, 0)+1);
        }


        int count = 0;
        for(String c: map.keySet()){
            if(map.get(c) == 1 && map2.getOrDefault(c, 0) ==1){
                count++;
            }
        }

return count;

    }
}