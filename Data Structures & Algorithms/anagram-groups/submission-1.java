class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String s : strs){
            char[] lettres = s.toCharArray();   // ['c', 'a', 't']
            Arrays.sort(lettres);                 // ['a', 'c', 't']
            String cle = new String(lettres);
            if (!result.containsKey(cle)) {
                result.put(cle, new ArrayList<>());
            }
            result.get(cle).add(s);
        }
        List<List<String>> a= new ArrayList<>(result.values());
        return a;
    }
}
