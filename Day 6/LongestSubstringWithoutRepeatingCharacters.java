class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,maxlen=0;
        HashSet<Character> set=new HashSet<>();
        while(left<s.length()){
            if(!set.contains(s.charAt(left))){
                set.add(s.charAt(left++));
                maxlen=Math.max(maxlen,set.size());
            }
            else{
                set.remove(s.charAt(right++));
            }
        }
        return maxlen;
    }
}