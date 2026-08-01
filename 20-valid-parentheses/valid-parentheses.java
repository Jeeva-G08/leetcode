class Solution {
    public boolean isValid(String s) {
       while(!s.equals(""))
       {
        if(s.contains("()")) s = s.replace("()","");
        else if(s.contains("[]")) s = s.replace("[]","");
        else if(s.contains("{}")) s = s.replace("{}","");
        else return false;
       }
       return true;
    }
}