
import java.util.ArrayList;

/**
 * @author Gabriel
 */
public class Exercicio04 {

    public static void main(String[] args) {

        /*
         4. Desenvolver um algoritmo armazene dez números, apresente-os, remover o
         número que está na posição 3, apresentar os números armazenados, remover o
         número que está na posição 4, apresentar os números armazenados e a quantidade
         de números que restaram no ArrayList.
         */
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2); 
        numeros.add(3); 
        numeros.add(4); 
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        //Apresentar dez números
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Números: " + numeros.get(i));

        }

        System.out.println("\n");

        //Remover numero na posição 3 e apresentar
        numeros.remove(3);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Números: " + numeros.get(i));
        }

        System.out.println("\n");

        //Remover numero na posicao 4 e apresentar
        numeros.remove(4);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Números: " + numeros.get(i));

        }

        System.out.println("\n");

        //Apresentar numeros restantes
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Números: " + numeros.get(i));

        }

            System.out.println("Quantidade restante: " + numeros.size());
    }

}
