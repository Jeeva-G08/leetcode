class Solution {
    public int lengthOfLastWord(String s) {
        String m[]=s.split(" ");
        String b=m[m.length-1];
        return b.length();

        
    }
}