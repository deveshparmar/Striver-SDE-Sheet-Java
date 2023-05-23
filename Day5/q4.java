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
        ListNode ans = new ListNode(-1);
        ans.next= head;
        ListNode slow = ans;
        ListNode fast  = ans;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return ans.next;
    }
}
