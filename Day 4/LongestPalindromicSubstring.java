class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String substr=new String();
        char[] ch=s.toCharArray();
        int substrlen=0,l,r;
        for(int i=0;i<ch.length;i++){
            l=i;
            r=i;
            while (l>=0 && r<ch.length && ch[l]==ch[r]){
                if((r-l+1)>substrlen){
                    substr=s.substring(l,r+1);
                    substrlen=r-l+1;
                }
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while (l>=0 && r<ch.length && ch[l]==ch[r]){
                if((r-l+1)>substrlen){
                    substr=s.substring(l,r+1);
                    substrlen=r-l+1;
                }
                l--;
                r++;
            }
        }
        return substr;
    }
}