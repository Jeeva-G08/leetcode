class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int sum=0;
            while(n!=0)
            {
                int mod=n%10;
                n=n/10;
                sum=sum+mod;
            }
            ans=Math.min(ans,sum);
        }
        return ans;
        
    }
}