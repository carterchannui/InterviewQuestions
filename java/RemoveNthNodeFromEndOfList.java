class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int right = 1;
        ListNode end = head;
        ListNode target = head;
        
        // Find end of list.
        while (end.next != null) {
            // Update cur.
            end = end.next;
            right++;
            // Update target if target is within bounds.
            if ((right - n) > 1) {
                target = target.next;
            }
        }
        
        // Remove the target node.
        if (right == 1) {
            // Check if there is only one node in the linked list.
            return null;
        } else if (right - n == 0) {
            // Check if the node to be removed is the current head node.
            head = target.next;
            return head;
        } else {
            // Remove the target node.
            target.next = target.next.next;
            return head;    
        }
    }
}
