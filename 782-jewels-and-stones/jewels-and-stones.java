class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        HashSet<Character>seen = new HashSet<>();
        int count = 0;
        for(char jewel: jewels.toCharArray()){
            seen.add(jewel);
        }

        for(char stone: stones.toCharArray()){
            if(seen.contains(stone)){
                count++;
            }
           
        }

        return count;
    }
}