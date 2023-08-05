package bishi0805weilai;

public class WL0701_01 {
    //public class Solution {
    //    /**
    //     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
    //     *
    //     *
    //     * @param head ListNode类
    //     * @return ListNode类
    //     */
    //    public ListNode longestList (ListNode head) {
    //        // write code here
    //        if (head == null) return null;
    //        if (head.next == null) return head;
    //        ListNode res = head;
    //        ListNode node = head;
    //        while (node != null && node.next != null) {
    //            ListNode curNode = node;
    //            ListNode nextNode = curNode.next;
    //            while (curNode != null && nextNode != null && (curNode.val + nextNode.val) % 2 == 0) {
    //                curNode.next = nextNode.next;
    //                nextNode = curNode.next;
    //            }
    //            node = node.next;
    //        }
    //        return res;
    //    }
    //}
}
