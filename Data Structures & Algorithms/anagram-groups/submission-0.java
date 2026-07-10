class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, List<String>> mp = new HashMap<>();

        for(int i=0; i<n; i++){
            int ch[] = new int[26];
            for(char c : strs[i].toCharArray()){
                ch[c - 'a']++;
            }

            String key = Arrays.toString(ch);

            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}
