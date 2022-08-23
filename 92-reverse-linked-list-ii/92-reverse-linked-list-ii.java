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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(left == right) return head;

        ListNode prev = null;
        ListNode curr = head;

        int i = 0;
        while(i != left-1){
            prev = curr;
            if(curr != null) {
                curr = curr.next;
            }
            i++;
        }

        ListNode last = prev;
        ListNode newEnd = curr;

        prev = curr;
        curr = curr.next;

        ListNode next = curr.next;

        int j = 0;

        while(j != right-left){
            if(curr != null){
                curr.next = prev;
            }
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
            j++;
        }
        if(last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = curr;
        return head;
    }

}