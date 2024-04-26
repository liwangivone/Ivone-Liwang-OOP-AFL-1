public class Peminjam {
    private String nama;
    private String alamat;
    private String gender;
    private String nomorTelp;
    private String prodi;
    private boolean statusDenda;
    private float nominalDenda;

    public Peminjam() {

    }

    public Peminjam(String nama, String alamat, String gender, String nomorTelp, String prodi, boolean statusDenda, float nominalDenda) {
        this.nama = nama;
        this.alamat = alamat;
        this.gender = gender;
        this.nomorTelp = nomorTelp;
        this.prodi = prodi;
        this.statusDenda = statusDenda;
        this.nominalDenda = nominalDenda;
    }


    public String getNama() {
        return this.nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNomorTelp() {
        return this.nomorTelp;
    }
    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }

    public String getProdi() {
        return this.prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public boolean isStatusDenda() {
        return this.statusDenda;
    }
    public boolean getStatusDenda() {
        return this.statusDenda;
    }

    public void setStatusDenda(boolean statusDenda) {
        this.statusDenda = statusDenda;
    }

    public float getNominalDenda() {
        return this.nominalDenda;
    }
    public void setNominalDenda(float nominalDenda) {
        this.nominalDenda = nominalDenda;
    }


    
}
