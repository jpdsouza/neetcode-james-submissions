class LinkedList {
    Node head;
    Node tail;

    class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
           this.value = value;
           this.next = next;
        }
    }

    public LinkedList() {
        head = new Node(-1, null);  // dummy
        tail = head;

    }

    public int get(int index) {
        Node curr = head.next;
        int i=0;
        while(curr!=null) {
            if (i==index) return curr.value;
            i++;
            curr= curr.next;
        }
        return -1;
        
    }

    public void insertHead(int val) {
        Node element = new Node(val, head.next);
        head.next = element;
        if(tail == head) {
            this.tail = element;
        }
    }

    public void insertTail(int val) {
        Node element = new Node(val, null);
        tail.next = element;
        tail = element;

    }

    public boolean remove(int index) {
        Node curr = head;
        int i = 0;
        while (i < index && curr !=null) {
            i++;
            curr = curr.next;
        }
        if (curr == null || curr.next == null) return false;
        if (curr.next == tail) tail = curr;
        curr.next = curr.next.next;
        return true;

        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = head.next;
        while(curr != null) {
            result.add(curr.value);
            curr = curr.next;
        }
        return result;
    }
}
