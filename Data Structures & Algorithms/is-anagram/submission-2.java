class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character,Integer> hm=new HashMap<>();
       for(char c:s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
       }
       HashMap<Character,Integer> hs=new HashMap<>();
       for(char c:t.toCharArray()){
        hs.put(c,hs.getOrDefault(c,0)+1);
       }
       if(hm.size()!=hs.size()){
        return false;
       }
       for(char c:s.toCharArray()){
        if(!hm.get(c).equals(hs.get(c))){
              return false;
        }
       }
       return true;
    }
}
