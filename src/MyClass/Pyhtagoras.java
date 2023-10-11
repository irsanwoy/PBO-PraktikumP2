
package MyClass;

public final class Pyhtagoras {
  
        double a = 6; // Panjang sisi a
        double b = 8; // Panjang sisi b
        double c;
        double keliling;

        // Menggunakan rumus Pythagoras untuk mencari panjang sisi c
        double luasC(){ 
              this.c = Math.sqrt(a * a + b * b);
              return this.c;
        }

        // Menghitung keliling segitiga
        double keliling(){ 
             this.keliling =  a + b + this.c;
            return this.keliling;
        }

    public void tampil() {
        System.out.println("========Pyhtsgoras=======");
        System.out.println("Nilai C = "+ luasC());
        System.out.println("Keliling = "+ keliling());
    }
        
        
    }


