class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int expected = 1;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

        while (expected < nums[i]) {
            result.add(expected);
            expected++;
        }

        if (nums[i] == expected) {
            expected++;
        }
    }

        while (expected <= nums.length) {
            result.add(expected);
            expected++;
        }

        return result;
    }
}