class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==1)return List.of( List.of(strs[0]));
        
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());

    }
}
