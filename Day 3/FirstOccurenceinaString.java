class FirstOccurenceinaString {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();

        if (needle.isEmpty()) {
            return 0;
        }
        if (m > n) {
            return -1;
        }
        for (int i = 0; i <= n - m; i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
}