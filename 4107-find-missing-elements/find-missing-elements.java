class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>list=new ArrayList<>();
         ArrayList<Integer>list2=new ArrayList<>();
        for(int i:nums)
        {
            list.add(i);
        }
        int min=list.get(0);
        int max=list.get(list.size()-1);
        for(int i=min;i<=max;i++)
        {
            if(!list.contains(i))
            {
                list2.add(i);
            }
        }
        return list2;
    }
}