class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];

        for(String st:strs){
            while(!st.startsWith(s)){
                s=s.substring(0,s.length()-1);
                if(s.isEmpty())return s;
            }
        }

        return s;
        
    }
}