class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val listSet = HashSet<Int>()
        for (num in nums) {
            if (!listSet.add(num)) {
                return true
            }
        }

        return false;
    }
}
