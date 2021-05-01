class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var num1Node = l1
        var num2Node = l2
        var carryNum = 0
        var resultNodeHead: ListNode? = null
        var prevNode: ListNode? = null
        while (true) {
            if (num1Node == null && num2Node == null && carryNum == 0) break
            val sum = (num1Node?.`val` ?: 0) +
                    (num2Node?.`val` ?: 0) +
                    carryNum

            carryNum = sum / 10
            if (prevNode == null) {
                prevNode = ListNode(sum % 10)
                resultNodeHead = prevNode
            } else {
                prevNode.next = ListNode(sum % 10)
                prevNode = prevNode.next
            }

            num1Node = num1Node?.next
            num2Node = num2Node?.next
        }
        return resultNodeHead
    }
}
