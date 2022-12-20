package recorrido;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Recorrido {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner osc = new Scanner(System.in);

        int valor, valor1;
        String Dato;

        System.err.println("Inserta el tamaño del Árbol que desea ingresar");

        int n = osc.nextInt();

        for (int i = 1; i <= n; i++) {
            //Dato = JOptionPane.showInputDialog("");
             System.out.println("Dame el  valor del nodo pricipal en el Arbol");
            valor = osc.nextInt();
            //System.out.println("Dame el  valor para colocar en el Arbol");
            //valor1 = osc.nextInt();
            arbol.insertarNodo(valor);
            
        }

        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();

        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();

        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPosorden();
    }

}
