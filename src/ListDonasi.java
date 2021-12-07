import java.util.Scanner;
public class ListDonasi {
    private NodeDonasi head;
    private NodeDonasi tail;
    private int jmlDonasi;
    private int size;
    Scanner input = new Scanner(System.in);
    
    public ListDonasi() {
    }

    public int getJmlDonasi() {
        return jmlDonasi;
    }

    public void setJmlDonasi(int jmlDonasi) {
        this.jmlDonasi = jmlDonasi;
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

    public void addDonasi(Campaign c, Donatur d,int uang) { 
        NodeDonasi newest = new NodeDonasi(c, d, null);
        int sementara = 0;
        
        
        if (isEmpty())
            head = newest; 
        else
            tail.setNext(newest);
        
        tail = newest; 
        
        //menambahkan uang donasi di data campaign
        if(c.status){
            int a = c.getUangDonasi();
            a += uang;
            c.setUangDonasi(a);
            
            //uang donasi masuk ke data donatur
            d.setUangDonasi(uang);

            //untuk jumlahin semua donasi
            int p = 0;
            p+=uang;
            setJmlDonasi(p);

            //print tanda berhasil donasi
            System.out.println("Donasi anda berhasil ditambahkan:) !!!");
            System.out.println("******************************************************");
            size++;
        }
        else{
            System.out.println("Maaf, Campaign ini sudah ditutup");
        }
        
        if(c.getUangDonasi()>=c.getTarget()){
            c.setTarget(c.getUangDonasi());
            c.setStatus(false);
        }
    }
    
    public void printHistory(){
        if(size==0){
            System.out.println("XXX--- Belum ada transaksi donasi ---XXX");
        }
        else{
            NodeDonasi print = head;
            int i=1;
         
            System.out.println(" ");
            System.out.println("----------------------------------- RIWAYAT DONASI ---------------------------------------");
            System.out.println("Transaksi Donasi sampai saat ini    = " + size());
            System.out.println("Donasi yang Terkumpul               = " + getJmlDonasi());
            System.out.println("___________________________________________________________________________________________");
            System.out.println("No. |  Kode Donasi \t| Nama Donatur \t \t| Campaign \t \t  | Uang Donasi");
            System.out.println("___________________________________________________________________________________________");
            
            for(int q=1; q<=size; q++){
                System.out.println(i + ".  |  T0"+i+ "\t \t| "+ print.getElement().getNamaDonatur()+ "\t \t \t| "+ print.getElement2().getNamaCampaign()+ "\t \t \t  | "+ print.getElement().getUangDonasi());
                print=print.getNext();
                i++;
            }
            System.out.println("");
        }
    }
    
    public void printDetailCampaign(){
        System.out.print("Masukkan nama campaign = ");
        String j = input.nextLine();
        NodeDonasi print = head;
        int q=1;
        
        
        if(size==0){
            System.out.println("Belum ada transaksi donasi");
        }
        else{
            for(int p=0; p<size; p++){
                if(print!=null){
                    if(print.getElement2().getNamaCampaign().equalsIgnoreCase(j)){
                    System.out.println("Nama Campaign       : " + print.getElement2().getNamaCampaign());
                    System.out.println("Target Donasi       : " + print.getElement2().getTarget());
                    System.out.println("Donasi Terkumpul    : " + print.getElement2().getUangDonasi());
                    System.out.println("______________________________________________________");
                    System.out.println("No. |  Nama Donatur \t \t  | Uang Donasi");
                    System.out.println("______________________________________________________");
                    while(print.getNext()!=null){
                        if(print.getElement2().getNamaCampaign().equalsIgnoreCase(j)){
                            System.out.println(q + ".  |"+ print.getElement().getNamaDonatur()+ "\t \t |"+ print.getElement().getUangDonasi());
                            q++;
                        }
                            print=print.getNext();
                    }
                    if(print.getElement2().getNamaCampaign().equalsIgnoreCase(j)){
                        System.out.println(q + ".  |"+ print.getElement().getNamaDonatur()+ "\t \t |"+ print.getElement().getUangDonasi());
                    }
                    System.out.println("______________________________________________________");
                }
                print = print.getNext();
                }
            }
        }
    }
}
