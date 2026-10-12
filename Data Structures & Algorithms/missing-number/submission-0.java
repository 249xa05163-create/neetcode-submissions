class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        int x=n*(n+1)/2;
        if(x==s){
            return 0;
        }else{
        return     x-s;
        }
    }
}
