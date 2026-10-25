class Solution {
    public int getSum(int a, int b) {
       while(b!=0){

        int aa=a^b;
      int bb=(a&b)<<1;
      a=aa;
      b=bb;
       }
       return a;
    }
}
