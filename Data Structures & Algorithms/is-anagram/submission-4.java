class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int [] freq = new int[26]; // 26 For lowercase english alphabets. 52 for both case, 256 for any ASCII Characters.
        for(int i=0; i<s.length(); i++){
            // Default initialisation of array index is 0;
            freq[s.charAt(i)-'a']++; //'a' string substraction will change both string in ASCII value and return int which will become index.
            // First increment of index value.
            // Then decrement of index value.
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
}
