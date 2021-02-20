class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        cur = head
        pre = None
        while head != None:
            cur = head
            head = head.next
            cur.next = pre
            pre = cur
        return cur
        