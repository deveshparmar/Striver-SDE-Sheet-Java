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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode tmp = new ListNode(-1);
        ListNode ans  = tmp;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ans.next = list1;
                ans=ans.next;
                list1=list1.next;
            }
            else if(list1.val>list2.val){
                ans.next = list2;
                ans=ans.next;
                list2=list2.next;
            }
        }

        while(list1!=null){
            ans.next = list1;
            ans = ans.next;
            list1=list1.next;
        }

        while(list2!=null){
            ans.next=list2;
            ans=ans.next;
            list2=list2.next;
        }

        return tmp.next;
         
    }
}
