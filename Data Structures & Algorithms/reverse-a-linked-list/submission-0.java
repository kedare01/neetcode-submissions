/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prevNode = null;
        do {
            // get current currentNode from head
            ListNode currentNode = head;
            // Move head to the next node
            head = head.next;
            // move pointer of currentNode to previous Node
            currentNode.next = prevNode;
            // move pointer of previousNode to currentNode
            prevNode = currentNode;

        } while (head != null); // loop till you move pointer of head to null reference of last node
        return prevNode;
    }
}
