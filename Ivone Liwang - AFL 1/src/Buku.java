public class Buku extends Produk {
    private String pengarang;
    private String penerbit;
    private String edisi;
    private String jenisSampul;

    // Constructor
    public Buku(String kode, String judul, String pengarang, String penerbit, int tahun, String edisi, String jenisSampul, int jumTersedia, int jumTerpinjam, int jumRusak, int total, String kategori) {
        super(kode, judul, tahun, jumTersedia, jumTerpinjam, jumRusak, total, kategori);
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.edisi = edisi;
        this.jenisSampul = jenisSampul;
    }




    // Getters and setters
    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    public String getJenisSampul() {
        return jenisSampul;
    }

    public void setJenisSampul(String jenisSampul) {
        this.jenisSampul = jenisSampul;
    }
}

enum kategori {
   Fiksi,
   Non Fiksi,
   Kitab Suci
}
