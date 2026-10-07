class Solution {
    public int search(int[] a, int target) {
        int n=a.length;
        int c=0;
        int pos=-1;
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]){
                c++;
            }else{
              pos=i+1;
            }
        }
        if(pos==-1){
           return  bs(a,0,n-1,target);
        }else{
             if(bs(a,0,pos-1,target)!=-1){
                return (bs(a,0,pos-1,target));
             }else if(bs(a,pos,n-1,target)!=-1){
                return (bs(a,pos,n-1,target));
             }else{
               return -1;
             }
        }
       // return -1;
    }
    public static int bs(int a[],int l,int h,int k){
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==k){
                return mid;
            }else if(a[mid]>k){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}
