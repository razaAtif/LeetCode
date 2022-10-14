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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode last = start;
        ListNode fast = start;
        ListNode first = start;
       
        for(int i = 1; i <= k-1; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            last = last.next;
        }
        for(int i = 0; i < k; i++){
            first = first.next;
        }
        
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
        
        return head;
    }
}