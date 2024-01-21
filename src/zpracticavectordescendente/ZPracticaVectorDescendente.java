/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.

*/

package zpracticavectordescendente;

public class ZPracticaVectorDescendente {

    public static void main(String[] args) {
        int[] numeros = new int[60];

        // Rellenar el vector con los primeros 100 números enteros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Imprimir los números en orden descendente
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

}
