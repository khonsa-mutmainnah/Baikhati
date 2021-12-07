public class ListDonatur {
    private NodeDonatur head = null;
    private NodeDonatur tail = null;
    private int size = 0; 

    public ListDonatur() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Donatur first() { 
        if (isEmpty()) return null;
        return head.getElement();
    }

    public Donatur last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addDonatur(Donatur donatur) { 
        NodeDonatur newest = new NodeDonatur(donatur, null); 
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest); 
        tail = newest; 
        size++;
    }
    
    public void printData(){
        if(size==0){
            System.out.println("Maaf, Belum ada donatur yang tersedia.");
        }
        else{
            NodeDonatur print = head;
            int i=1;
            
            System.out.println(" ");
            System.out.println("_____________________________________________________");
            System.out.println("------------------- DATA DONATUR --------------------");
            System.out.println("Jumlah Donatur = " + size());
            System.out.println("______________________________________________________");
            System.out.println("No.  |  Kode \t| Nama Donatur \t \t| No Telepon");
            System.out.println("______________________________________________________");
            while(print!=null){
                System.out.println(i + ".   |   "+ "D0"+i+"\t| "+ print.getElement().getNamaDonatur()+ "\t| "+ print.getElement().getNoTelp());
                print = print.getNext();
                i++;
            }
            System.out.println("______________________________________________________");
            System.out.println("");
        }
    }
}
