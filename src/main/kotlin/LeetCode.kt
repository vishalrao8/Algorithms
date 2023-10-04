class LeetCode {
    fun numDecodings(s: String): ArrayList<String> {
        val result = arrayListOf<String>()

        fun helper(s: String, idx: Int, slate: ArrayList<Int>) {

//            if (slate[slate.lastIndex] == )

            if (idx == slate.size) {
                return
            }
            else {
                helper(s, idx + 1, slate)

                slate.add(s[idx].digitToInt())
                helper(s, idx + 1, slate)
                slate.removeLast()
            }
        }

        helper(s, 0 , arrayListOf())
        return result
    }
}