class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, List<Integer>> groupOfNum = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            groupOfNum.computeIfAbsent(num, key -> new ArrayList<>()).add(num);
        }
        List<Integer> keys = new ArrayList<>(groupOfNum.keySet());
        keys.sort((a, b) -> groupOfNum.get(b).size() - groupOfNum.get(a).size());
        for (int i = 0; i < k; i++) {
            result.add(keys.get(i));
        }
        return result.stream().mapToInt(Integer::intValue).toArray(); 
    }
}
