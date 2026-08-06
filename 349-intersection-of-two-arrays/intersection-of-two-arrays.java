class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
           Set<Integer>set2=new HashSet<>();
         Set<Integer>set3=new HashSet<>();
         int i=0;
        for(int x:nums1)
        {
            set1.add(x);
        }
        
        for(int x:nums2)
        {
            set2.add(x);
        }
        for(int x:set1)
        {
           if( set2.contains(x))
           {
            set3.add(x);
           }
        }
        int a[]=new int[set3.size()];
        for(int x:set3)
        {
            a[i++]=x;
        }
        return a;
    }
}