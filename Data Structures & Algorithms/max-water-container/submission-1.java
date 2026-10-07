class Solution {
    public int maxArea(int[] a) {
     int p1=0,p2=a.length-1;
     int ma=Integer.MIN_VALUE;
     while(p1<p2){
        int w=p2-p1;
        int d=Math.min(a[p1],a[p2]);
          ma=Math.max(ma,w*d);
        if(a[p1]<a[p2]){
            p1++;
        }else
        {
            p2--;
        }
     }
     return ma;   
    }
}
