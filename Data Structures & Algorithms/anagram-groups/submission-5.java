class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
  List<List<String>> result = new ArrayList<>();
        HashMap <String , List<String>> Map = new HashMap<>();
        for(String txt : strs) {
            char[] chars = txt.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            Map.computeIfAbsent(key, k -> new ArrayList<>()).add(txt);
        }
        
        for (List<String> group : Map.values()) {
            result.add(group);
        }
        return result;
    }
}
