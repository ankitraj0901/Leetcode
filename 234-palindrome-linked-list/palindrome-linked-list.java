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
    public static boolean isPalindrome(ListNode head) {
        if(head==null)
            return false;
        if(head.next==null)
            return true;
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        if (size % 2 == 0) {
            for (int i = 0; i < size/2; i++) {
                s.push(temp.val);
                temp = temp.next;
            }
        }else {
            for (int i = 0; i < (size/2); i++) {
                s.push(temp.val);
                temp = temp.next;
            }
            temp = temp.next;
        }
        s.forEach(System.out::println);
        while(temp!=null){
            if(!s.isEmpty() && !(s.pop()==temp.val)){
                return false;
            }
            temp=temp.next;
        }

        return s.isEmpty();
    }
}