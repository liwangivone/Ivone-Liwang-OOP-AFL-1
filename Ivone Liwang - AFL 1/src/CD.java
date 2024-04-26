public class CD extends Produk {
    private String kategoriCD;

    // Constructor
    public CD(String kode, String judul, int tahun, String kategoriCD, int jumTersedia, int jumTerpinjam, int jumRusak, int total, String kategori) {
        super(kode, judul, tahun, jumTersedia, jumTerpinjam, jumRusak, total, kategori);
        this.kategoriCD = kategoriCD;
    }



    // Getters and setters
    public String getKategoriCD() {
        return kategoriCD;
    }

    public void setKategoriCD(String kategoriCD) {
        this.kategoriCD = kategoriCD;
    }
}

enum kategoriCD {
    IMT,
    VCD,
    MAN
}


