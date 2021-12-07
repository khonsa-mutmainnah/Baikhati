public class NodeDonatur {
    private Donatur donatur; 
    private NodeDonatur next; 
    

    public NodeDonatur(Donatur d, NodeDonatur n) {
        donatur = d;
        next = n;
    }

    public Donatur getElement() {
        return donatur;
    }

    public NodeDonatur getNext() {
        return next;
    }

    public void setNext(NodeDonatur n) {
        next = n;
    }
}
