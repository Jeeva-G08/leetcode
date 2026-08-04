class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String result="";
        for(String s1:arr)
        {
            for(int i=s1.length()-1;i>=0;i--)
            {
                result=result+s1.charAt(i);
            }
            result=result+" ";
        }
        return result.trim();
    }
}