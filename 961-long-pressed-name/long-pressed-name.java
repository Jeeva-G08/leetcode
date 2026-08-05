class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int na=0;
        int ty=0;

        while (ty<typed.length()) 
        {

            if (na<name.length()&&name.charAt(na)==typed.charAt(ty)) 
            {
                na++;
                ty++;
            }
            else if(ty>0&&typed.charAt(ty)==typed.charAt(ty-1))
            {
                ty++;
            }
            else
            {
                return false;
            }
        }

        return na==name.length();
    }
}