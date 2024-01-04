package tubespbofix;

public abstract class DataPesanan {
    private int no;
    private String nama;
    private String no_hp;
    private String paket;
    private int berat;
    private String harga;

    public DataPesanan(int no, String nama, String no_hp, String paket,int berat, String harga) {
        this.no = no;
        this.nama = nama;
        this.no_hp = no_hp;
        this.paket = paket;
        this.berat = berat;
        this.harga = harga;
    }
    
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
