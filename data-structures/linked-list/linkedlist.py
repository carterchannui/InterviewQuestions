class Node:
    def __init__(self, val=None):
        self.val = val
        self.next = None
        self.prev = None

    def __str__(self):
        return str(str.val)

class LinkedList:
    def __init__(self, values=None):
        self.head = None
        self.tail = None

        if values is not None:
            self.add_multiple_nodes(values)

    def add_node(self, value):
        # Check if LinkedList is empty.
        if self.head is None:
            # Set new Node as head and tail of LinkedList.
            self.head = self.tail = Node(value)
        else:
            # Add Node to end of LinkedList.
            self.tail.next = Node(value)
            self.tail = self.tail.next

