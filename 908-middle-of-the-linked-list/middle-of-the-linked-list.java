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
    public ListNode middleNode(ListNode head) {
        int c=0;
        ListNode temp= head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int mid =c/2;
        for(int i=0;i<mid;i++){
            head=head.next;
        }
        return head;
    }
}