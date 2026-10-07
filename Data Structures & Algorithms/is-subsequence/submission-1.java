class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        int c=0;
        int p1=0,p2=0;
        while(p1<n&&p2<m){
           if(s.charAt(p2)==t.charAt(p1)){
            p1++;
            p2++;
            c++;
           }else{
            p1++;
           }
        }
        if(c==m){
            return true;
        }
        return false;
    }
}