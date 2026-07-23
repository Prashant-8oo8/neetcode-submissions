class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] ch=s.toCharArray();
        char[] ct=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ct);
        for(int i=0;i<s.length();i++){
            if(ch[i]!=ct[i])return false;
        }
        return true;
    }
}
