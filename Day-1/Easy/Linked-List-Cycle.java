//Question - Leetcode(141 Easy)
//Keep Two Pointers fast and slow and if they ever happen to point at the same node, There is a cycle in the list

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
      }
    return false;
    }
}
