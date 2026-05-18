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
        if(head==null||left==right){
            return head;
        }
        ListNode temp=head;
        ListNode after=null;
        ListNode before=null;
        ListNode beforeleft=null;
        for(int i=1;i<left;i++){
            beforeleft=temp;
            temp=temp.next;
        }
        ListNode start=temp;
        // normal reversal
        for(int i=left;i<=right;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
        // handle left side
        if(beforeleft!=null){
            beforeleft.next=before;
        }else{
            head=before;
        }
        // handle right side
        start.next=temp;
        return head;
    }
}