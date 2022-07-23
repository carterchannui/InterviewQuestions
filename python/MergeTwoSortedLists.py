class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        # Result linked list.
        result = ListNode(0)
        cur = result
        
        # Iterate through linked lists.
        while list1 != None and list2 != None:
            if list1.val < list2.val:
                # Add smaller node to result linked list.
                cur.next = list1
                # Remove node from previous linked list.
                list1 = list1.next
            elif list1.val >= list2.val:
                # Add smaller node to result linked list.
                cur.next = list2
                # Remove node from previous linked list.
                list2 = list2.next
            # Set cur to newly added node.
            cur = cur.next
        # Add remaining node from either list1 or list2.
        cur.next = list1 or list2
        # Return result linked list (excluding initial node).
        return result.next
