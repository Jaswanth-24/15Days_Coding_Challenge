class LC125{
    public static boolean isPalindrome(String s) {
        boolean result=true;
        String s1=s.replaceAll("[^a-zA-Z0-9]","");
        int i=0,j=s1.length()-1;
        while(i<s1.length()){
            if(Character.toLowerCase(s1.charAt(i))!=Character.toLowerCase((s1.charAt(j)))){
               result=false;
               break;
            }
            i++;
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome((s)));
    }
}