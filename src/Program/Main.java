package Program;
// memanggil semua yang ada di package MyClass
import MyClass.*;

public class Main {
    public static void main(String[] args) {
       var pyhtagoras = new Pyhtagoras();
       pyhtagoras.tampil();
       
       var jarakTempuhBulanMatahari = new JarakMatahariBulan();
       jarakTempuhBulanMatahari.tampil();
       
       var konversi = new Konversi();
       konversi.tampil();
    }
}
