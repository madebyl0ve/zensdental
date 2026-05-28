package ZENSDENTAL;
import java.util.Date;
import model.HariLibur; 

public class FormPendaftaran extends javax.swing.JFrame {

    public FormPendaftaran() {
        initComponents();
    }

    public void validasiPendaftaran(Date tanggalPilihanPasien) {
        
        HariLibur hariRaya = new HariLibur();
        hariRaya.setTanggalLibur(new Date(2026, 4, 25)); 
        hariRaya.setKeterangan("Hari Raya Waisak");

        if (tanggalPilihanPasien.equals(hariRaya.getTanggalLibur())) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Maaf, Pendaftaran Gagal! Klinik Tutup karena " + hariRaya.getKeterangan(), 
                "Peringatan Klinik", 
                javax.swing.JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Tanggal aman, lanjut simpan ke database!");
        }
    }

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {            
        Date tglPilihan = txtTanggalKunjungan.getDate(); 
        
        validasiPendaftaran(tglPilihan);
    }                                         
}
