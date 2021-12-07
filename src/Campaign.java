public class Campaign {
    private String namaCampaign;
    private int uangDonasi;
    private int Target;
    private String kategori;
    boolean status;

    public Campaign(String c, int t, String k){
        this.namaCampaign = c;
        this.Target = t;
        this.kategori = k;
    }

    public int getUangDonasi() {
        return uangDonasi;
    }

    public void setUangDonasi(int uangDonasi) {
        this.uangDonasi = uangDonasi;
    }

    public String getNamaCampaign() {
        return namaCampaign;
    }

    public void setNamaCampaign(String namaCampaign) {
        this.namaCampaign = namaCampaign;
    }

    public int getTarget() {
        return Target;
    }

    public void setTarget(int Target) {
        this.Target = Target;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
