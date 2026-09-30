class TrieNode:
    def __init__(self):
        self.node = [None] * 26
        self.end = False

class PrefixTree:

    def __init__(self):
        self.root = TrieNode()

    def insert(self, word: str) -> None:
        cur = self.root
        for ch in word:
            i = ord(ch) - ord('a')
            if not cur.node[i]:
                cur.node[i] = TrieNode()
            cur = cur.node[i]
        cur.end = True

    def search(self, word: str) -> bool:
        cur = self.root
        for ch in word:
            i = ord(ch) - ord('a')
            if not cur.node[i]:
                return False
            cur = cur.node[i]
        return cur.end
        

    def startsWith(self, prefix: str) -> bool:
        cur = self.root
        for ch in prefix:
            i = ord(ch) - ord('a')
            if not cur.node[i]:
                return False
            cur = cur.node[i]
        return True
        
        