/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscar;

/**
 *
 * @author js289
 */
public class Pato implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El pato vuela con sus alas de plumas.");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada remando con sus patas en el agua.");
    }
}
