
import java.util.ArrayList;

/**
 * @author Gabriel
 */
public class Exercicio02 {

    public static void main(String[] args) {

        /*
         2. Desenvolver um algoritmo que crie um ArrayList para armazenar nomes, 
         deve-se armazenar 9 nomes, apresentar todos os nomes contidos no ArrayList.
         Obs.: não é permitido utilizar nenhuma estrutura de repetição (for, while, do while).
         */
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Marcos");
        nomes.add("Pedro");
        nomes.add("Lucas");
        nomes.add("Caio");
        nomes.add("Gabriel");
        nomes.add("Leandro");
        nomes.add("Roberto");
        nomes.add("Renato");

        System.out.println("Nomes: " + nomes.get(0)
                + ", " + nomes.get(1)
                + ", " + nomes.get(2)
                + ", " + nomes.get(3)
                + ", " + nomes.get(4)
                + ", " + nomes.get(5)
                + ", " + nomes.get(6)
                + ", " + nomes.get(7)
                + ", " + nomes.get(8) + ".");

    }

}
