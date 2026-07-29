class Solution {
    public boolean rotateString(String s, String goal) {
        char arr1 []= s.toCharArray();
        char arr2[]= goal.toCharArray();
        int n=s.length();
        boolean ans=false;
        for(int i=0;i<arr1.length;i++)
        {
            char fis=arr1[0];
            int m=1;
            for(int j=0;j<arr1.length-1;j++)
            {
                arr1[j]=arr1[m];
                m++;
            }
            arr1[n-1]=fis;
            if(Arrays.equals(arr1,arr2))
            {
                ans=true;
                return ans;
            }

        }
     return false;
        
    }
}