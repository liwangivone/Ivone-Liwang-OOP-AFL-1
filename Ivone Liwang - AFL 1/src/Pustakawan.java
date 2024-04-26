public class Pustakawan {
    private String idPustakawan;
    private String nama;
    private String alamat;
    private String gender;
    private String nomorTelp;
    private String email;
    private String password;


    public Pustakawan(String idPustakawan, String nama, String alamat, String gender, String nomorTelp, String email, String password) {
        this.idPustakawan = idPustakawan;
        this.nama = nama;
        this.alamat = alamat;
        this.gender = gender;
        this.nomorTelp = nomorTelp;
        this.email = email;
        this.password = password;
    }


    public String getIdPustakawan() {
        return this.idPustakawan;
    }
    public void setIdPustakawan(String idPustakawan) {
        this.idPustakawan = idPustakawan;
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

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }






}
