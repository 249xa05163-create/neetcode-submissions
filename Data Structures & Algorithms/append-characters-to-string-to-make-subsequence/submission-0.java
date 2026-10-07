class Solution {
    public int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
        int p1=0,p2=0;
        while(p1<n&&p2<m){
            if(s.charAt(p1)==t.charAt(p2)){
                p1++;
                p2++;
            }else{
                p1++;
            }
        }
        return (m-p2);
    }
}