package algos

object NPComplete {
    fun generateSubSet(set: List<Any>): List<String> {
        val result = mutableListOf<String>()

        fun helper(set: List<Any>, position: Int, slate: MutableList<Any>) {
            if (position == set.size) {
                result.add(slate.joinToString(prefix = "[", postfix = "]"))
                return
            } else {
                slate.add(set[position])
                helper(set, position + 1, slate)
                slate.removeLast()

                helper(set, position + 1, slate)
            }
        }
        helper(set, 0, mutableListOf())
        return result
    }
}