public class Donatur {
    private String namaDonatur;
    private String noTelp;
    private int uangDonasi;

    public Donatur(String c, String no){
        this.namaDonatur = c;
        this.noTelp = no;
    }

    public String getNamaDonatur() {
        return namaDonatur;
    }

    public void setNamaDonatur(String namaDonatur) {
        this.namaDonatur = namaDonatur;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public int getUangDonasi() {
        return uangDonasi;
    }

    public void setUangDonasi(int uangDonasi) {
        this.uangDonasi = uangDonasi;
    }
    
    
}
