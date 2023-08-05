package bishi1016tengxun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author: wwx
 * @date: 2022/10/16 19:53
 * @describe:
 */
public class Question1 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(0);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(1);
        ListNode b = new ListNode(0);
        b.next = new ListNode(1);
        ListNode res = new Question1().xorList(a, b);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
    public ListNode xorList (ListNode a, ListNode b) {
        // write code here
        LinkedList<Integer> lista = new LinkedList<>();
        LinkedList<Integer> listb = new LinkedList<>();
        while(a != null){
            lista.add(a.val);
            a = a.next;
        }
        while (b != null) {
            listb.addFirst(b.val);
            b = b.next;
        }
        LinkedList<Integer> listLong = lista.size() >= listb.size() ? lista : listb;
        LinkedList<Integer> listShort = lista.size() < listb.size() ? lista : listb;
        Stack<Integer> stackRes = new Stack<>();
        while (!listShort.isEmpty()) {
            int l = listLong.removeLast();
            int s = listShort.removeLast();
            stackRes.push(l == s ? 0 : 1);
        }
        while (!listLong.isEmpty()) {
            int l = listLong.removeLast();
            stackRes.push(l);
        }
        while (!stackRes.isEmpty() && stackRes.peek() != 1) {
            stackRes.pop();
        }
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while (!stackRes.isEmpty()) {
            temp.next = new ListNode(stackRes.pop());
            temp = temp.next;
        }
        return head.next;
    }
}
class ListNode {
    int val;
    ListNode next = null;
    public ListNode(int val) {
    this.val = val;
    }
}