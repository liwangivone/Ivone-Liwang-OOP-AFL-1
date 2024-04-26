public class Produk {
    private String kode;
    private String judul;
    private int jumTersedia;
    private int jumTerpinjam;
    private int jumRusak;
    private int total;
    private String kategori;
    private int tahun;

    public Produk() {

    }

    public Produk(String kode, String judul, int tahun, int jumTersedia, int jumTerpinjam, int jumRusak, int total, String kategori) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
        this.jumTersedia = jumTersedia;
        this.jumTerpinjam = jumTerpinjam;
        this.jumRusak = jumRusak;
        this.total = total;
        this.kategori = kategori;
    }


    public String getKode() {
        return this.kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return this.judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumTersedia() {
        return this.jumTersedia;
    }
    public void setJumTersedia(int jumTersedia) {
        this.jumTersedia = jumTersedia;
    }

    public int getJumTerpinjam() {
        return this.jumTerpinjam;
    }
    public void setJumTerpinjam(int jumTerpinjam) {
        this.jumTerpinjam = jumTerpinjam;
    }

    public int getJumRusak() {
        return this.jumRusak;
    }
    public void setJumRusak(int jumRusak) {
        this.jumRusak = jumRusak;
    }

    public int getTotal() {
        return this.total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public String getKategori() {
        return this.kategori;
    }
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getTahun() {
        return this.tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }



 





    


    
}
