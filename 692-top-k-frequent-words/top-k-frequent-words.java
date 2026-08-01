class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        HashMap<String,Integer> map  = new HashMap<>();
        for(String  i : words)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<String,Integer>> list1 = new ArrayList<>(map.entrySet());
        list1.sort((a,b) -> 
        {
            if(!a.getValue().equals(b.getValue()))
            {
                return b.getValue()-a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });

        for(int i = 0;i<k;i++)
        {
            list.add(list1.get(i).getKey());
        }
        System.out.println(list1);
        return list;

        
    }
}