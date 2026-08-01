class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int num = -1;
        int freq= 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            if(key%2==0)
            {
                if( value>freq || (value==freq && key<num))
                {
                    freq = value;
                    num = key;
                }
            }
        }
          return num;
    }
}