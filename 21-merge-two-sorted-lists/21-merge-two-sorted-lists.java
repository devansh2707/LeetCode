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
        ListNode dummy = new ListNode(0);       // pointing to head 
        ListNode current = dummy;
        ListNode p= list1;
        ListNode q=list2;
        
        while(p!=null && q !=null){
            if(p.val<q.val){
                current.next=p;
                p=p.next;
            }
            else{
                current.next=q;
                q=q.next;
            }
            current=current.next;
        }
        // now if any node is left unvisited
        if(p!=null){
            current.next=p;
            p=p.next;
            
        }
        if(q!=null){
            current.next = q;
            q=q.next;
            
        }
        
        
        
        return dummy.next;
        
    }
}