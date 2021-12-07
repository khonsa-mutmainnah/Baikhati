public class NodeDonasi {
    private Campaign campaign;
    private Donatur donatur; 
    private NodeDonasi next;

    public NodeDonasi(Campaign c, Donatur d, NodeDonasi n) {
        campaign = c;
        donatur = d;
        next = n;
    }

    public Donatur getElement() {
        return donatur;
    }
    
    public Campaign getElement2(){
        return campaign;
    }
    
    public NodeDonasi getNext() {
        return next;
    }

    public void setNext(NodeDonasi next) {
        this.next = next;
    }
}
