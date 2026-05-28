
package ZENSDENTAL;

public class Dokter {
    private String idDokter;
    private String namaDokter;
    private String spesialis;

    public Dokter(String idDokter, String namaDokter, String spesialis) {
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public String getSpesialis() {
        return spesialis;
    }
}

