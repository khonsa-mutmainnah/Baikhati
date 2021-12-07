import java.util.Scanner;
public class ListCampaign {
    private NodeCampaign head = null;
    private NodeCampaign tail = null;
    private Campaign pilih;
    private int size = 0;
    
    
    Scanner input = new Scanner(System.in);

    public ListCampaign() {
    }

    public Campaign getPilih() {
        return pilih;
    }

    public void setPilih(Campaign pilih) {
        this.pilih = pilih;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Campaign first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public Campaign last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addCampaign(Campaign campaign) {
        NodeCampaign newest = new NodeCampaign(campaign, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
            tail = newest;
        
            campaign.setStatus(true);
            System.out.println("Campaign berhasil ditambahkan!");
            size++;
    }
    
    public void showCampaign(){
        if(size==0){
            System.out.println("Maaf, Campaign belum tersedia.");
        }
        else{
            NodeCampaign print = head;
            int i=1;
            
            while(print!=null){
                System.out.print( i + ". ");
                System.out.println(print.getElement().getNamaCampaign());
                print = print.getNext();
                i++;
            }
            System.out.println("");
        }
    }
    
    public void printCampaign(){
        if(size==0){
            System.out.println("Maaf, Campaign belum tersedia.");
        }
        else{
            NodeCampaign print = head;
            int i=1;
            
            System.out.println("");
            System.out.println("______________________________________________________");
            System.out.println("------------------- CAMPAIGN TERSEDIA ----------------");
            System.out.println("Jumlah Campaign = " + size());
            System.out.println("______________________________________________________");
            while(print!=null){
                System.out.print( i + ". ");
                System.out.println(print.getElement().getNamaCampaign());
                System.out.println("kategori              = " + print.getElement().getKategori());
                System.out.println("Target Donasi         = " + print.getElement().getTarget());
                System.out.println("Donasi yang Terkumpul = "+print.getElement().getUangDonasi());
                System.out.println(print.getElement().getStatus()==true? "status                = buka":"status                = tutup");
                System.out.println("______________________________________________________");
                print = print.getNext();
                i++;
            }
        }
    }
    
    public void printCampaignPerKategori(){
        System.out.println("1. Balita dan Anak                                     |");
        System.out.println("2. Bencana Alam                                        |");
        System.out.println("3. Rumah Ibadah                                        |");
        System.out.println("4. Infrastuktur Umum                                   |");
        System.out.println("5. Kegiatan Sosial                                     |");
        System.out.println("______________________________________________________");
        System.out.println("");
        System.out.print("Masukkan kategori campaign = ");
        String j = input.nextLine();
        NodeCampaign print = head;
        boolean ketemu = false;
        
        if(size==0){
            System.out.println("Belum ada campaign tersedia");
        }
        else{
            if(isEmpty()){
                System.out.println("belum ada campaign tersedia");
                System.out.println("______________________________________________________");  
            }
            else{
                while(print.getNext()!=null){
                    if(print.getElement().getKategori().equalsIgnoreCase(j)){
                        ketemu = true;
                        System.out.println("______________________________________________________"); 
                        System.out.println("Nama Campaign       : " + print.getElement().getNamaCampaign());
                        System.out.println("Target Donasi       : " + print.getElement().getTarget());
                        System.out.println("Donasi Terkumpul    : " + print.getElement().getUangDonasi());
                        System.out.println("______________________________________________________");
                    }
                    print = print.getNext();
                }
                if(print.getElement().getKategori().equalsIgnoreCase(j)){
                        System.out.println("______________________________________________________"); 
                        System.out.println("Nama Campaign       : " + print.getElement().getNamaCampaign());
                        System.out.println("Target Donasi       : " + print.getElement().getTarget());
                        System.out.println("Donasi Terkumpul    : " + print.getElement().getUangDonasi());
                        System.out.println("______________________________________________________");
                    }
                if(!ketemu){
                    System.out.println("Maaf campaign pada kategori ini tidak tersedia");
                
                }
            }
        }
    }
     
    public void editNamaCampaign(int no){
        NodeCampaign data = head;
        
        for(int i = 1; i < no; i++){
            data = data.getNext();
        }

        setPilih(data.getElement());
        
        input = new Scanner(System.in);
        System.out.print("Masukkan nama campaign baru = ");
        String nama = input.nextLine();
        data.getElement().setNamaCampaign(nama);
        
        System.out.println("Nama Campaign berhasil diubah");
    }
    
    public void editTargetCampaign(int no){
        NodeCampaign data = head;
        
        for(int i = 1; i < no; i++){
            data = data.getNext();
        }

        setPilih(data.getElement());
        
        input = new Scanner(System.in);
        System.out.print("Masukkan target baru campaign = ");
        int target = input.nextInt();
        data.getElement().setTarget(target);
        
        if(data.getElement().getUangDonasi()<=data.getElement().getTarget()){
            data.getElement().setStatus(true);
        }
        System.out.println("Target donasi campaign berhasil diubah");
    }
    
    public void cariCampaign(int no){
        NodeCampaign data = head;
        
        for(int i = 1; i < no; i++){
            data = data.getNext();
        }

        setPilih(data.getElement());
    }
}
