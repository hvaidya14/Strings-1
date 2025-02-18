class Solution {
    public String customSortString(String order, String s) {
        
        Map<Character, Integer> m = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<order.length();i++) {
            if(m.containsKey(order.charAt(i))) {
                int freq = m.get(order.charAt(i));
                for(int j=0;j<freq;j++) {
                    sb.append(order.charAt(i));
                }
                m.remove(order.charAt(i));
            }
        }

        for (Character c : m.keySet())  {
            int freq = m.get(c);
            for(int j=0;j<freq;j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
