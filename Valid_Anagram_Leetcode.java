class Solution {
    public boolean isAnagram(String s, String t) {
        int [] ht,hs;
        ht = new int[26];
        hs = new int[26];

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            c = (char)(c-97);
            hs[c]++;
        }
        for(int i=0;i<t.length();i++){
            int c = t.charAt(i);
            ht[c- 97]++;
        }
        for(int i=0;i<26;i++){
            if(hs[i]!=ht[i]){
                return false;
            }
        }
        return true;
    }
}