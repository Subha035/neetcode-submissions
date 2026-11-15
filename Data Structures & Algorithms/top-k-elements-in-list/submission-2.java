class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Put all unique keys into a list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Sort keys from highest frequency to lowest frequency
        list.sort((a, b) -> map.get(b) - map.get(a));

        // Copy only the top k elements into the result array
        int[] resultArray = new int[k];
        for (int i = 0; i < k; i++) {
            resultArray[i] = list.get(i);
        }

        return resultArray;
    }
}
