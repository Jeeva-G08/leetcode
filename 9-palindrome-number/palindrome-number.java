class Solution {
    public boolean isPalindrome(int x) {
    
        int m=x;
        int sum=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int mod=x%10;
            sum=(sum*10)+mod;
            x=x/10;
        }if(sum==m){
            return true;


        }
        else
        {
            return false;
        }
    }
}