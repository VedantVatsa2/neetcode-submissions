class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        for (int i=0; i<n; i++){
            int c=0;
            if(map1.containsKey(s.charAt(i))){
                c = map1.get(s.charAt(i));
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            } 
            else
                map1.put(s.charAt(i), 1);
        }
        for (int j=0; j<m; j++){
            int c=0;
            if(map2.containsKey(t.charAt(j))){
                c = map2.get(t.charAt(j));
                map2.put(t.charAt(j), map2.get(t.charAt(j))+1);
            } 
            else
                map2.put(t.charAt(j), 1);
        }
        if(map1.equals(map2))
            return true;
        return false;
    }
}
