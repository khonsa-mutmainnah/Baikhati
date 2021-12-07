public class NodeCampaign {
    private Campaign campaign;
    private NodeCampaign next;
    

    public NodeCampaign(Campaign c, NodeCampaign n) {
        campaign = c;
        next = n;
    }

    public Campaign getElement() {
        return campaign;
    }

    public NodeCampaign getNext() {
        return next;
    }

    public void setNext(NodeCampaign n) {
        next = n;
    }
}
