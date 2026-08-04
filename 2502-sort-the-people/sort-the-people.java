class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        int a[]=new int[n];
        int j=0;
        int end=names.length-1;
        String rest[]=new String[n];
        for(int i:heights)
        {
            a[j]=i;
            j++;
        }
        Arrays.sort(a);
        for(int i=0;i<names.length;i++)
        {
            for(int m=0;m<names.length;m++)
            {
               if(a[i]==heights[m])
               {
                rest[end]=names[m];
                end--;
               }
            }
        }
        return rest;
        
    }
}