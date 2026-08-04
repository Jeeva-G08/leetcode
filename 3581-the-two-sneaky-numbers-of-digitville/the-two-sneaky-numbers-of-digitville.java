class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:nums)
        {
            if(!set.contains(i))
            {
                set.add(i);
            }
            else
            {
                list.add(i);
            }
        }
        int n=list.size();
        int a[]=new int[n];
        int i=0;
        for(int j:list){
        a[i]=j;
        i++;
        }
        return a;

    }
}