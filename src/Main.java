import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListCampaign lc = new ListCampaign();
        ListDonatur ld = new ListDonatur();
        ListDonasi ldo = new ListDonasi();
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        
        System.out.println("           Selamat Datang di Baikhati.com");
        System.out.println("******************************************************");
        
        while(lanjut){
            System.out.println("1. Galang dana                                        |");
            System.out.println("2. Donasi                                             |");
            System.out.println("3. Info                                               |");
            System.out.println("4. Edit Campaign                                      |");
            System.out.println("5. Keluar                                             |");
            System.out.println("******************************************************");
            
            input = new Scanner(System.in);
            System.out.print("Apa yang akan anda lakukan? ");
            int answer = input.nextInt();
            System.out.println(" ");
            System.out.println("______________________________________________________");
            
            if(answer==1){
                System.out.println("|   Ayo Galang Dana untuk Mereka yang Membutuhkan :)  |");
                System.out.println("______________________________________________________");
                
                //input user tentang campaign
                System.out.println("1. Balita dan Anak                                    |");
                System.out.println("2. Bencana Alam                                       |");
                System.out.println("3. Rumah Ibadah                                       |");
                System.out.println("4. Infrastuktur Umum                                  |");
                System.out.println("5. Kegiatan Sosial                                    |");
                System.out.println("______________________________________________________");
                input = new Scanner(System.in);
                System.out.print("pilih kategori campaign no : ");
                int q = input.nextInt();
                String w = "kategori";
                if(q==1){
                    w = "Balita dan Anak";
                }
                else if(q==2){
                    w = "Bencana Alam";
                }
                else if(q==3){
                    w = "Rumah Ibadah";
                }
                else if(q==4){
                    w = "Infrastuktur Umum";
                }
                else if(q==5){
                    w = "Kegiatan Sosial";
                }
                else{
                    System.out.println("Maaf, data yang anda masukkan salah");
                    lanjut = true;
                }
                input = new Scanner(System.in);
                System.out.print("Masukkan judul campaign    : ");
                String a = input.nextLine();
                
                input = new Scanner(System.in);
                System.out.print("Masukkan target donasi     : ");
                int b = input.nextInt();
                
                //buat objek campaign
                Campaign c = new Campaign(a,b,w);
                lc.addCampaign(c);
                System.out.println("______________________________________________________");
                
                System.out.print("Kembali ke Halaman Utama [1. Ya | 2. Keluar] ");
                int d = input.nextInt();
                if(d==1){
                    lanjut = true;
                }
                else if(d==2){
                    System.out.println("");
                    System.out.println("Terimakasih!");
                    System.out.println("Sampai Jumpa di Lain Waktu :D");
                    System.out.println("_______________________________________________________");
                    lanjut = false;
                }
                else{
                    System.out.println("Maaf, input yang anda masukkan salah!");
                    lanjut = true;
                }
                 System.out.println(" ");
                 System.out.println("******************************************************");
            }
            
            else if(answer==2){
                lc.printCampaign();
                
                if(lc.isEmpty()){
                }
                else{
                    if(lc.isEmpty()){
                    System.out.println("maaf, tidak ada campaign yang tersedia");
                }
                else{
                    System.out.println("******************************************************");
                    System.out.println("           Bantu Mereka yang Membutuhkan :)           |");
                    System.out.println("******************************************************");
                    //pilih campaign
                    System.out.print("Kirim donasi untuk campaign ke-            = ");
                    int e = input.nextInt();
                    lc.cariCampaign(e);

                    if(lc.getPilih().getStatus()){
                        //data donatur
                        input = new Scanner(System.in);
                        System.out.print("Masukkan nama anda                         = ");
                        String f = input.nextLine();

                        System.out.print("Masukkan nomor telepon anda                = ");
                        String g = input.nextLine();
                        Donatur d1 = new Donatur(f, g);
                        ld.addDonatur(d1);

                        //uang donasi
                        System.out.print("Masukkan jumlah donasi yang anda berikan   = ");
                        int h = input.nextInt();

                        //transaksi donasi
                        ldo.addDonasi(lc.getPilih(), d1, h);
                    }
                    else{
                        System.out.println("Maaf, Campaign ini sudah ditutup");
                    }
                    }
                }
                System.out.print("Kembali ke Halaman Utama [1. Ya | 2. Keluar] ");
                int d = input.nextInt();
                if(d==1){
                    lanjut = true;
                }
                else if(d==2){
                    System.out.println("");
                    System.out.println("Terimakasih!");
                    System.out.println("Sampai Jumpa di Lain Waktu :D");
                    System.out.println("_______________________________________________________");
                    lanjut = false;
                }
                else{
                    System.out.println("Maaf, input yang anda masukkan salah!");
                    lanjut = true;
                }
                 System.out.println(" ");
                 System.out.println("******************************************************");
            }
            
            else if(answer==3){
                System.out.println("----------------- INFO Baikhati.com -------------------");
                System.out.println("1. Campaign yang tersedia                              |");
                System.out.println("2. Riwayat Campaign                                    |");
                System.out.println("3. Campaign per Kategori                               |");
                System.out.println("4. Riwayat Donasi                                      |");
                System.out.println("5. Data Donatur                                        |");
                System.out.println("______________________________________________________");
                System.out.print("Lihat info no = ");
                int d = input.nextInt();
                
                if(d==1){
                    
                    lc.printCampaign();
                    
                    System.out.print("Kembali ke Halaman Utama [1. Ya | 2. Keluar] ");
                    int i = input.nextInt();
                    if(d==1){
                        lanjut = true;
                    }
                    else if(d==2){
                        System.out.println("");
                        System.out.println("Terimakasih!");
                        System.out.println("Sampai Jumpa di Lain Waktu :D");
                          System.out.println("______________________________________________________");
                        lanjut = false;
                    }
                    else{
                        System.out.println("Maaf, input yang anda masukkan salah!");
                        lanjut = true;
                    }
                    System.out.println(" ");
                    System.out.println("******************************************************");
                }
                
                else if(d==2){
                    lc.showCampaign();
                    ldo.printDetailCampaign();
                    
                    System.out.print("Kembali ke Halaman Utama [1. Ya | 2. Keluar] ");
                    int i = input.nextInt();
                    if(i==1){
                        lanjut = true;
                    }
                    else if(i==2){
                        System.out.println("");
                        System.out.println("Terimakasih!");
                        System.out.println("Sampai Jumpa di Lain Waktu :D");
                        System.out.println("_______________________________________________________");
                        lanjut = false;
                    }
                    else{
                        System.out.println("Maaf, input yang anda masukkan salah!");
                        lanjut = true;
                    }
                    System.out.println(" ");
                    System.out.println("******************************************************");
                }
                
                else if(d==3){
                    lc.printCampaignPerKategori();
                    
                    System.out.print("Kembali ke Halaman Utama [1. Ya | 2. Keluar] ");
                    int i = input.nextInt();
                    if(i==1){
                        lanjut = true;
                    }
                    else if(i==2){
                        System.out.println("");
                        System.out.println("Terimakasih!");
                        System.out.println("Sampai Jumpa di Lain Waktu :D");
                        System.out.println("_______________________________________________________");
                        lanjut = false;
                    }
                    else{
                        System.out.println("Maaf, input yang anda masukkan salah!");
                        lanjut = true;
                    }
                    System.out.println(" ");
                    System.out.println("******************************************************");
                }
                
                else if(d==4){
                    ldo.printHistory();
                    
                    System.out.print("Kembali ke Halaman Utama [1. Ya | 2. Keluar] ");
                    int i = input.nextInt();
                    if(i==1){
                        lanjut = true;
                    }
                    else if(i==2){
                        System.out.println("");
                        System.out.println("Terimakasih!");
                        System.out.println("Sampai Jumpa di Lain Waktu :D");
                        System.out.println("_______________________________________________________");
                        lanjut = false;
                    }
                    else{
                        System.out.println("Maaf, input yang anda masukkan salah!");
                        lanjut = true;
                    }
                    System.out.println(" ");
                    System.out.println("******************************************************");
                }
                else if( d== 5){
                    ld.printData();
                    
                    System.out.print("Kembali ke Halaman Utama [1. Ya | 2. Keluar] ");
                    int i = input.nextInt();
                    if(i==1){
                        lanjut = true;
                    }
                    else if(i==2){
                        System.out.println("");
                        System.out.println("Terimakasih!");
                        System.out.println("Sampai Jumpa di Lain Waktu :D");
                        System.out.println("_______________________________________________________");
                        lanjut = false;
                    }
                    else{
                        System.out.println("Maaf, input yang anda masukkan salah!");
                        lanjut = true;
                    }
                    System.out.println(" ");
                    System.out.println("******************************************************");
                }
                else{
                    System.out.println("Maaf, input yang anda masukkan salah");
                    lanjut = true;
                }
            }
            else if(answer==4){
                System.out.println("1. Ubah nama campaign");
                System.out.println("2. Ubah target campaign");
                
                System.out.print("pilih satu = ");
                int a = input.nextInt();
                
                if(a==1){
                    lc.printCampaign();
                    System.out.print("Ubah campaign no = ");
                    int b = input.nextInt();
                    lc.editNamaCampaign(b);
                }
                else if(a==2){
                    lc.printCampaign();
                    System.out.print("Ubah campaign no = ");
                    int b = input.nextInt();
                    lc.editTargetCampaign(b);
                }
                else{
                    System.out.println("maaf, data yang anda masukkan salah");
                }
                
                System.out.print("Kembali ke Halaman Utama [1. Ya | 2. Keluar] ");
                int i = input.nextInt();
                if(i==1){
                    lanjut = true;
                }
                else if(i==2){
                    System.out.println("");
                    System.out.println("Terimakasih!");
                    System.out.println("Sampai Jumpa di Lain Waktu :D");
                    System.out.println("_______________________________________________________");
                    lanjut = false;
                }
                else{
                    System.out.println("Maaf, input yang anda masukkan salah!");
                    lanjut = true;
                }
                System.out.println(" ");
                System.out.println("******************************************************");
            }
            
            else if(answer==5){
                System.out.println("");
                System.out.println("Terimakasih!");
                System.out.println("Sampai Jumpa di Lain Waktu :D");
                System.out.println("_______________________________________________________");
                lanjut = false;
            }
            else{
                System.out.println("Maaf, input yang anda masukkan salah");
                lanjut = true;
            }
        }
    }
}

