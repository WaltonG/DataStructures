package datastructures;

public class BasicLinkedList<X> {
    private Node first;
    private Node last;
    private int nodeCount = 0;

    public BasicLinkedList() {
        first = null;
        last = null;
    }

    public void add(X item){
        //this condition means we are adding something for the first time
        if (first == null) {
            first = new Node(item);
            last = first;
        }
        //otherwise, we want to grab the last node and update it's value
        else {
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last =  newLastNode;
        }
        nodeCount++;
    }

    public int size() {
        return nodeCount;
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
