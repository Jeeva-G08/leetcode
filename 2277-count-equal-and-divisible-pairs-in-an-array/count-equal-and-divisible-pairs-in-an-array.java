class Solution {
    public int countPairs(int[] nums, int k) {
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int tem=1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    tem=i*j;
                     if(tem%k==0)
                {
                    count++;
                }
                }
            }
        }
        return count;
    }
}