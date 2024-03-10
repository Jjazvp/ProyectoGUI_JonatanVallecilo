package proyectogui_jonatanvallecillo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProyectoGUI_JonatanVallecillo {

    static Scanner leer = new Scanner(System.in);
    static Scanner leer1 = new Scanner(System.in);
    
    public static void main(String[] args) {
        int menu = 1;
        int opcion = 0;
        while (menu == 1){
            int val = 1;
            while(val == 1){
                System.out.print("***** MENU ******\n"
                    + "1. Registro\n"
                    + "2. Salir\n"
                    + "Ingrese la opcio que desea: ");
                opcion = leer.nextInt();
                if(opcion > 0 && opcion < 3){
                    val = 0;
                }else{
                    System.out.println("ERROR. Intente de nuevo.");
                }
            }
            switch(opcion){
                case 1:
                    Registro registro = new Registro();
                    registro.setVisible(true);
                    registro.setLocationRelativeTo(null);
                    registro.setTitle("Registro UNITEC");
                    break;
                case 2:
                    menu = 0;
                    break;
            }
        }
    }
}
