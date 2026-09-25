# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if not root:
            return TreeNode(val)

        self.prev = None
        self.cur = root
        while self.cur:
            self.prev = self.cur
            if self.cur.val < val:
                self.cur = self.cur.right
            else:
                self.cur = self.cur.left
        if val > self.prev.val:
            self.prev.right = TreeNode(val)
        else:
            self.prev.left = TreeNode(val)

        return root

