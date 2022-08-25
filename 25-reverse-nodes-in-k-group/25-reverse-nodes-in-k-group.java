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
    public ListNode reverseKGroup(ListNode head, int k) {
            if(k <= 1 || head == null) return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode tmp = head;
        
        int length = 0;
        while(tmp != null) {
            length++;
            tmp = tmp.next;
        }

        while(curr != null){
            ListNode newEnd = curr;
            ListNode last = prev;
            ListNode next = curr.next;

            for (int i = 0; i < k; i++) {
                
                if(curr != null)  curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null) next = next.next;
            }

            if(last != null) last.next = prev;
            else head = prev;

            newEnd.next = curr;
            prev = newEnd;
            length = length-k;
            if(length / k == 0) break;
        }
        return head;
    }
}