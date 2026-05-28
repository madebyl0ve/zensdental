package ZENSDENTAL;

public class Pendaftaran {
    private int idPendaftaran;
    private String noAntrean;
    private String noRM;
    private String idDokter;
    private String idPiket;
    private String tglPeriksa;
    private String keluhan;

    public Pendaftaran(int idPendaftaran, String noAntrean, String noRM, String idDokter, String idPiket, String tglPeriksa, String keluhan) {
        this.idPendaftaran = idPendaftaran;
        this.noAntrean = noAntrean;
        this.noRM = noRM;
        this.idDokter = idDokter;
        this.idPiket = idPiket;
        this.tglPeriksa = tglPeriksa;
        this.keluhan = keluhan;
    }

    public int getIdPendaftaran() {
        return idPendaftaran;
    }

    public String getNoAntrean() {
        return noAntrean;
    }

    public String getNoRM() {
        return noRM;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public String getIdPiket() {
        return idPiket;
    }

    public String getTglPeriksa() {
        return tglPeriksa;
    }

    public String getKeluhan() {
        return keluhan;
    } 
}
