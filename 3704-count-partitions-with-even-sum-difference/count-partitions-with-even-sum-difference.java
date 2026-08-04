class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int leftsum=0;
            int rigsum=0;
            for(int j=0;j<=i;j++)
            {
                leftsum+=nums[j];
            }
            for(int k=nums.length-1;k>i;k--)
            {
                rigsum+=nums[k];
            }
            int result=rigsum-leftsum;
            if(result%2==0)
            {
                count++;
            }
        }
        return count;
        
    }
}