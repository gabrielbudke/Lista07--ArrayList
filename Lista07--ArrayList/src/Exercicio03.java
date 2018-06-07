
import java.util.ArrayList;

/**
 * @author Gabriel
 */
public class Exercicio03 {

    public static void main(String[] args) {

        /*
         3. Desenvolver um algoritmo que crie um ArrayList para armazenar char, deve-se
         armazenar 15 caracteres, apresentar todos os caracteres armazenados no ArrayList.
         Obs.: não é permitido utilizar nenhuma estrutura de repetição (for, while, do while).
         */
        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('a');
        caracteres.add('b');
        caracteres.add('c');
        caracteres.add('d');
        caracteres.add('e');
        caracteres.add('f');
        caracteres.add('g');
        caracteres.add('h');
        caracteres.add('i');
        caracteres.add('j');
        caracteres.add('k');
        caracteres.add('l');
        caracteres.add('m');
        caracteres.add('n');
        caracteres.add('o');

        System.out.println("Caracteres: " + caracteres.get(0)
                + ", " + caracteres.get(1)
                + ", " + caracteres.get(2)
                + ", " + caracteres.get(3)
                + ", " + caracteres.get(4)
                + ", " + caracteres.get(5)
                + ", " + caracteres.get(6)
                + ", " + caracteres.get(7)
                + ", " + caracteres.get(8)
                + ", " + caracteres.get(9)
                + ", " + caracteres.get(10)
                + ", " + caracteres.get(11)
                + ", " + caracteres.get(12)
                + ", " + caracteres.get(13)
                + ", " + caracteres.get(14) + ".");

    }

}
