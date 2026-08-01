class Solution {
    public int reverse(int x) {
        long sum=0;
        while(x!=0)
        {
        int mod=x%10;
        sum=(sum*10)+mod;
        x=x/10; 
        }
        if(Integer.MAX_VALUE<sum||Integer.MIN_VALUE>sum)
        {
            return 0;
        }
        else
        {
            return (int) sum;
        }
        
    }
}