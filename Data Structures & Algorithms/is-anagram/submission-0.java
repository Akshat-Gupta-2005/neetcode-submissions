class Solution {
    public boolean isAnagram(String s, String t) {
        Map <Character , Integer > hm = new HashMap<>();
        if (s.length() != t.length()) return false;

        for (int i = 0 ; i < s.length() ; i++){
            if (hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i) , hm.get(s.charAt(i)) +1 );
            }
            else{
                hm.put(s.charAt(i) , 1);
            }
        }
        for (int i = 0 ; i < t.length() ; i++){
            if (hm.containsKey(t.charAt(i))){
                int n = hm.get(t.charAt(i));
                if (n == 0) return false;
                hm.put(t.charAt(i) , n -1 );
            }
            else{
                return false;
            }
        }
        return true;

    }
}
