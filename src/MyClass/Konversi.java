package MyClass;

public class Konversi {
    double C, F, R;

    public Konversi() {
        this.C = 10;
        this.F = 15;
        this.R = 5;
    }

    double celciusKeFahrenheit() {
        return (9.0 / 5.0 * this.C) + 32;
    }

    double celciusKeReamur() {
        return 4.0 / 5.0 * this.C;
    }

    double fahrenheitKeCelcius() {
        return 5.0 / 9.0 * (this.F - 32);
    }

    double fahrenheitKeReamur() {
        return 4.0 / 9.0 * (this.F - 32);
    }

    double reamurKeFahrenheit() {
        return (9.0 / 4.0 * this.R) + 32;
    }

    double reamurKeCelcius() {
        return 5.0 / 4.0 * this.R;
    }

    public void tampil() {
        System.out.println("=====Konversi Suhu=======");
        System.out.println("Celcius ke Fahrenheit\t=" + celciusKeFahrenheit());
        System.out.println("Celcius ke Reamur\t=" + celciusKeReamur());
        System.out.println("Fahrenheit ke Celcius\t=" + fahrenheitKeCelcius());
        System.out.println("Fahrenheit ke Reamur\t=" + fahrenheitKeReamur());
        System.out.println("Reamur ke Fahrenheit\t=" + reamurKeFahrenheit());
        System.out.println("Reamur ke Celcius\t=" + reamurKeCelcius());
    }
}
