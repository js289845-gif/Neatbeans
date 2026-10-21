/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscar;

/**
 *
 * @author js289
 */

public class BUSCAR {
    public static void main(String[] args) {
        
        Avion miAvion = new Avion();
        Pato miPato = new Pato();

       
        System.out.println("--- Acción del Avión ---");
        miAvion.volar();

        System.out.println("\n--- Acciones del Pato (Herencia Múltiple) ---");
        miPato.volar();
        miPato.nadar();
    }
}
