class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Max heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        // Extract top k frequent elements
        int[] result = new int[k];

        while (k > 0 && !maxHeap.isEmpty()) {
            result[k-1] = maxHeap.poll().getKey();
            k--;
        }

        return result;
    }
}
