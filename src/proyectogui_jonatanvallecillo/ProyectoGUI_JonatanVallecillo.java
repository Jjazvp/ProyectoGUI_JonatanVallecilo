package proyectogui_jonatanvallecillo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProyectoGUI_JonatanVallecillo {

    static Scanner leer = new Scanner(System.in);
    static Scanner leer1 = new Scanner(System.in);
    
    public static void main(String[] args) {
        Registro registro = new Registro();
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
        registro.setTitle("Registro UNITEC");
    }
}
