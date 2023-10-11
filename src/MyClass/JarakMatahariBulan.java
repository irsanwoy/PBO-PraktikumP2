package MyClass;

public class JarakMatahariBulan {
    double kecepatanCahaya, JarakBumiKeBulan, jarakBumiKeMatahari;

    public JarakMatahariBulan() {
        this.kecepatanCahaya = 300000;
        this.JarakBumiKeBulan = 384400;
        this.jarakBumiKeMatahari = 1521;
    }

    // Menghitung waktu tempuh ke Bulan (dalam detik)
    double waktuKeBulan() {
        return JarakBumiKeBulan / kecepatanCahaya;
    }

    // Menghitung waktu tempuh ke Matahari (dalam detik)
    double waktuKeMatahari() {
        return jarakBumiKeMatahari / kecepatanCahaya;
    }

    public void tampil() {
        System.out.println("=====Jarak Tempuh ke Bulan & Matahari========");
        System.out.println("Bumi Ke Matahari\t:" + waktuKeMatahari() + " detik");
        System.out.println("Bumi Ke Bulan\t:" + waktuKeBulan() + " detik");
    }
}
