class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int k=i;
        int c=0;
        while(k>0){
            k=k&(k-1);
            c++;
        }
        a[i]=c;
        }
        return a;
    }
}
