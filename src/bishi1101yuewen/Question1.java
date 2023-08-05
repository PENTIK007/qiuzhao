package bishi1101yuewen;

/**
 * @author: wwx
 * @date: 2022/11/1 19:16
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode res = new Question1().oddEvenList(node1);

    }
    public ListNode oddEvenList (ListNode head) {
        // write code here
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode jishu = new ListNode(0);
        ListNode jishuNode = jishu;
        ListNode oushu = new ListNode(0);
        ListNode oushuNode = oushu;
        boolean flag = true;
        while(head != null){
            if(flag){
                jishuNode.val = head.val;
                jishuNode.next = new ListNode(0);
                jishuNode = jishuNode.next;
            }else{
                oushuNode.val = head.val;
                oushuNode.next = new ListNode(0);
                oushuNode = oushuNode.next;
            }
            head = head.next;
        }
        jishuNode.next = oushu;
        return jishu;
    }
}
class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
    this.val = val;
    }
}
