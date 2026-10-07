class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int a[]=new int[arr.length];
        a[n-1]=arr[n-1];
        int max=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
           a[i]=Math.max(arr[i+1],a[i+1]);
        }
        a[n-1]=-1;
        return a;
    }
}