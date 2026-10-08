class Solution {
    public int findMin(int[] a) {
        int n=a.length;
        int k=-1;
        int c=0;
        for(int i=0;i<n-1;i++){
           if( a[i]<a[i+1]){
            c++;
           }else{
            k=i+1;
            break;
           }
        }
           if(k==-1){
            return a[0];
           }else{
            return a[k];
           }
        
      //  return -1;
    }
    }
