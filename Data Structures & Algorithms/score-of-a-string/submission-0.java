class Solution {
    public int scoreOfString(String s) {
      int sum=0;
      char ch[]=s.toCharArray();
      for(int i=0;i<s.length()-1;i++) {
        sum+=Math.abs(ch[i+1]-ch[i]);
      } 
      return sum;
    }
}