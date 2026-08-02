import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> list = new ArrayList<>();

        char[] arr = p.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i <= s.length() - p.length(); i++) {

            String tem = s.substring(i, i + p.length());

            char[] temarr = tem.toCharArray();
            Arrays.sort(temarr);

            if (Arrays.equals(temarr, arr)) {
                list.add(i);
            }
        }

        return list;
    }
}