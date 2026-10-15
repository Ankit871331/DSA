class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer>map = new HashMap<>();

        for(String word: s1.split(" ")){
            map.put(word, map.getOrDefault(word, 0) +1);
        }

        for(String word2: s2.split(" ")){
            map.put(word2, map.getOrDefault(word2, 0) +1);
        }
        
        List<String>list = new ArrayList<>();
        for(String word: map.keySet()){
            if(map.get(word) == 1 ){
                list.add(word);
            }

        }

        return list.toArray(new String[0]);
    }
}