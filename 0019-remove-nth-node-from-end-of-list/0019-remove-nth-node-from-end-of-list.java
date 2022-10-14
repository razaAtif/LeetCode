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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0) return head;
        if(head == null || head.next == null) return null;
        
        ListNode temp = head;
        int count = 1;
        
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        
        if(count == n) return head.next;
        
        int index = count-n;
        
        count = 1;
        ListNode tmp = head;
        while(count != index){
            tmp = tmp.next;
            count++;
        }
        tmp.next = tmp.next.next;
        return head;
    }
}