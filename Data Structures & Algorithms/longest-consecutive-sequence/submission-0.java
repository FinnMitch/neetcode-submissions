class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) seen.add(num);
        int longest = 0;
        for (int num : seen) {
            if (!seen.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (seen.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}