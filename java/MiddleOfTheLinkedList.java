class Solution {
    public ListNode middleNode(ListNode head) {
        // Track the current length of the linked list.
        int right = 1;
        // Track the current middle of the linked list.
        int center = 1;
        ListNode mid = head;
        ListNode cur = head;
        
        while (cur.next != null) {
            // Update cur.
            cur = cur.next;
            right++;
            // Update mid.
            if (center < (right / 2) + 1) {
                center = (right / 2) + 1;
                mid = mid.next;
            }
        }
        return mid;
    }
}
