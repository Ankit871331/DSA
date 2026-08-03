class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // Move left pointer until we find a vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            // Move right pointer until we find a vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            // Swap the vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    
    private boolean isVowel(char c) {
        // Check both lowercase and uppercase
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}