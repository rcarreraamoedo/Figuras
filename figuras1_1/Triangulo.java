/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras1_1;

/**
 *
 * @author usuario
 */
public class Triangulo {

    public void Triangulo() {
        int max = 5;
        int base = 0, altura = 0;

        for (base = 1; base <= max; base++) {

            for (altura = 0; altura < base; altura++) {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
