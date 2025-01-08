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
    public ListNode detectCycle(ListNode head){
        HashMap<Integer,HashMap<Integer, Boolean>> map=new HashMap<>();
        ListNode temp=head;
        int index = 0;
        ListNode result = null;
        while(temp!=null){
            int hascode = System.identityHashCode(temp);
            HashMap<Integer, Boolean> isPresent = map.get(hascode);
            if(isPresent == null){
                HashMap<Integer, Boolean> x = new HashMap<>();
                x.put(index, true);
                map.put(hascode, x);
            }
            else{
                result = temp;
                break;
            }
            index++;
            temp=temp.next;
        }
        return result;
    }
}