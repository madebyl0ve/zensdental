package ZENSDENTAL;
import java.util.Date;

public class HariLibur {
    private Date tanggalLibur;
    private String keterangan;

    public HariLibur() {
    }
    
    public HariLibur(Date tanggalLibur, String keterangan) {
        this.tanggalLibur = tanggalLibur;
        this.keterangan = keterangan;
    }

    public Date getTanggalLibur() {
        return tanggalLibur;
    }

    public void setTanggalLibur(Date tanggalLibur) {
        this.tanggalLibur = tanggalLibur;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public String toString() {
        return "HariLibur{" +
                "tanggalLibur=" + tanggalLibur +
                ", keterangan='" + keterangan + '\'' +
                '}';
    }
}
