class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groupsAnagram = new HashMap<>();
        // sort
        for (int i = 0; i < strs.length; i++) {
            String key = sortedString(strs[i]);
            groupsAnagram.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(groupsAnagram.values());
    }

    private static String sortedString(String input) {
        char[] sortedStr = input.toCharArray();
        Arrays.sort(sortedStr);
        return Arrays.toString(sortedStr);
    }
}
