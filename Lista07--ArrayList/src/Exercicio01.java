
import java.util.ArrayList;

/**
 * @author Gabriel
 */
public class Exercicio01 {

    public static void main(String[] args) {

        /* 1. Desenvolver um algoritmo que crie um ArrayList para armazenar 
         números inteiros,após isto armazenar 15 números e apresentar os mesmos.
         Obs.: não é permitido utilizar nenhuma estrutura de repetição (for, while, do while).
         */
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(30);
        numeros.add(35);
        numeros.add(40);
        numeros.add(45);
        numeros.add(50);
        numeros.add(55);
        numeros.add(60);
        numeros.add(65);
        numeros.add(70);
        numeros.add(75);
        numeros.add(80);

        System.out.println("Números: " + numeros.get(0)
                + "; " + numeros.get(1)
                + "; " + numeros.get(2)
                + "; " + numeros.get(3)
                + "; " + numeros.get(4)
                + "; " + numeros.get(5)
                + "; " + numeros.get(6)
                + "; " + numeros.get(7)
                + "; " + numeros.get(8)
                + "; " + numeros.get(9)
                + "; " + numeros.get(10)
                + "; " + numeros.get(11)
                + "; " + numeros.get(12)
                + "; " + numeros.get(13)
                + "; " + numeros.get(14) + ".");

    }

}
