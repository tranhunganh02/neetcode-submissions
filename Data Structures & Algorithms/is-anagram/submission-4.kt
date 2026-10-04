class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val chars = s.toMutableList()

        for (char in t) {
            
            if (chars.contains(char)) {
                chars.remove(char)
            } else {
                return false
            }
        }

        return true
    }
}