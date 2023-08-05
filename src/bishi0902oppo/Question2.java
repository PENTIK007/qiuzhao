package bishi0902oppo;

import java.util.ArrayList;
import java.util.Collections;

public class Question2 {
    public static void main(String[] args) {

    }
    public ListNode combineTwoDisorderNodeToOrder (ListNode node1, ListNode node2) {
        // write code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (node1 != null) {
            arrayList.add(node1.val);
            node1 = node1.next;
        }
        while (node2 != null) {
            arrayList.add(node2.val);
            node2 = node2.next;
        }
        Collections.sort(arrayList);
        ListNode res = new ListNode(arrayList.get(0));
        ListNode temp = res;
        for (int i = 1; i < arrayList.size(); i++) {
            temp.next = new ListNode(arrayList.get(i));
            temp = temp.next;
        }
        return res;
    }
}
class ListNode {
  int val;
  ListNode next = null;
  public ListNode(int val) {
    this.val = val;
  }
}