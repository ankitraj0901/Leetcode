import java.util.*;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            int hashcode=System.identityHashCode(temp);
            if(map.get(hashcode)==null){
                map.put(hashcode,true);
            }
            else
                break;
            temp=temp.next;
        }
        ListNode temp1=head;
        int count=-1;
        while(temp1!=temp){
            count=count+1;
            temp1=temp1.next;
        }
        return temp;
    }
}