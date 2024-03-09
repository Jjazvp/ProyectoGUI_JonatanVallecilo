package proyectogui_jonatanvallecillo;

public class Estudiante {
    String numeroCuenta = "";
    String codigoClase = "";
    int Año = 0;
    int numSec = 0;

    public Estudiante() {
    }
    
    public Estudiante(String numeroCuenta, String codigoClase, int Año, int numSec) {
        this.numeroCuenta = numeroCuenta;
        this.codigoClase = codigoClase;
        this.Año = Año;
        this.numSec = numSec;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getCodigoClase() {
        return codigoClase;
    }

    public int getAño() {
        return Año;
    }

    public int getNumSec() {
        return numSec;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public void setNumSec(int numSec) {
        this.numSec = numSec;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "numeroCuenta=" + numeroCuenta + ", codigoClase=" + codigoClase + ", A\u00f1o=" + Año + ", numSec=" + numSec + '}';
    }
}
