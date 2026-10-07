class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        int n=a.length;
        Arrays.sort(a);
        List<List<Integer>> ans=new ArrayList<>();
       // int p1=0,p2=p1+1,p3=n-1;
        for(int p1=0;p1<n-1;p1++){
            int p2=p1+1,p3=n-1;
            if(p1 > 0 && a[p1] == a[p1 - 1])
    continue;
        while(p2<p3){
            if(a[p1]+a[p2]+a[p3]==0){
                List<Integer> p=new ArrayList<>();
                p.add(a[p1]);
                p.add(a[p2]);
                p.add(a[p3]);
                ans.add(p);
                p2++;
                p3--;
                while(p2<p3&&a[p2]==a[p2-1]){
                    p2++;
                }
                while(p2<p3&&a[p3+1]==a[p3]){
                    p3--;
                }
            }else if(a[p1]+a[p2]+a[p3]>0){
                p3--;
            }else{
                p2++;
            }
        }
        }
        return ans; 
    }
}
