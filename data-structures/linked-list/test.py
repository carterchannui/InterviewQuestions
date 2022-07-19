import unittest
from linkedlist import *

class Test(unittest.TestCase):
    
    # Test node addition.
    def test_1(self):
        list = LinkedList()
        list.add_node(5)
        list.add_node(10)
        list.add_node(15)
        list.add_node(20)
        self.assertEqual(5, list.head.val)
        # Assume the nodes inbetween are added properly.
        self.assertEqual(20, list.tail.val)

if __name__ == "__main__":
    unittest.main()
