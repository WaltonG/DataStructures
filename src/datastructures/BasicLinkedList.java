package datastructures;

public class BasicLinkedList<X> {
    private Node first;
    private Node last;

    public BasicLinkedList() {
        first = null;
        last = null;
    }

    private class Node{
        private Node nextNode;
        private X nodeItem;

        public Node(X nodeItem) {
            this.nextNode = null;
            this.nodeItem = nodeItem;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public X getNodeItem() {
            return nodeItem;
        }
    }
}
