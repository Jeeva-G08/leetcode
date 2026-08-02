class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            String sr="";
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(sr.contains(ch+""))
                {
                    break;
                }
                sr+=ch;
                max=Math.max(max,sr.length());
            }
        }
        return max;
    }
}