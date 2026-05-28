
package ZENSDENTAL;

public class Pasien {
    private String noRM;
    private String namaPasien;
    private String genderPasien;
    private String tipePasien;
    private String kategori;

    public Pasien(String noRM, String namaPasien, String genderPasien, String tipePasien, String kategori) {
        this.noRM = noRM;
        this.namaPasien = namaPasien;
        this.genderPasien = genderPasien;
        this.tipePasien = tipePasien;
        this.kategori = kategori;
    }

    public String getNoRM() {
        return noRM;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public String getGenderPasien() {
        return genderPasien;
    }

    public String getTipePasien() {
        return tipePasien;
    }

    public String getKategori() {
        return kategori;
    }
}

