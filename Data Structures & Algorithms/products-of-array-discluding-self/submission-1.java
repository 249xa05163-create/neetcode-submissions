class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pr=new int[nums.length];
        int[] su=new int[nums.length];
        pr[0]=nums[0];
        su[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
             pr[i]=nums[i]*pr[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            su[j]=nums[j]*su[j+1];
        }
        int a[]=new int[nums.length];
        a[0]=su[1];
        a[nums.length-1]=pr[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            a[i]=pr[i-1]*su[i+1];
        }
        return a;
    }
}  
