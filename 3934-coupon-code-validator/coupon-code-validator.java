class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> res = new ArrayList<>();
        int c = code.length;
        // int b = businessLine.length;
        int a = isActive.length;
        List<String> order = Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");
        Map<String, List<String>> map = new HashMap<>();
        for (String b : order) {
            map.put(b, new ArrayList<>());
        }
        int n=c;
        for(int i=0;i<n;i++)
        {
            if((code[i]!=null&&!code[i].isEmpty()&&code[i].matches("[a-zA-Z0-9_]+"))&&(isActive[i]==true)&&(map.containsKey(businessLine[i])))
            {
                map.get(businessLine[i]).add(code[i]);
            }
        }
        for (String b : order) {
            List<String> list = map.get(b);
            Collections.sort(list); 
            res.addAll(list);
        }
        return res;
    }
}