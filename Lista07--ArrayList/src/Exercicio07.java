
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Budke
 */
public class Exercicio07 {

    public static void main(String[] args) {

        String maiorNome = "";
        String menorNome = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String texto = "";

        byte paulo = 0;
        byte ana = 0;
        byte iniciaVogal = 0;

        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            while (true) {

                String cadastro = JOptionPane.showInputDialog("Cadastre o " + (i + 1) + "° nome: ").trim();

                if (!cadastro.equals("")) {
                    nomes.add(cadastro);
                    texto += cadastro + ", ";
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Nome não pode ser vazio!!", null, JOptionPane.ERROR_MESSAGE);

                }

            }

        }

        //Maior nome
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).length() > maiorNome.length()) {
                maiorNome = nomes.get(i);
            }
        }

        //Menor nome
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).length() < menorNome.length()) {
                menorNome = nomes.get(i);
            }
        }

        //Paulo e Ana
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equalsIgnoreCase("ana")) {
                ana++;
            } else if (nomes.get(i).equalsIgnoreCase("paulo")) {
                paulo++;
            }

        }

        //inicia com vogal
        for (int i = 0; i < nomes.size(); i++) {
            char vogal = nomes.get(i).charAt(0);

            if (vogal == 'a' 
                    || vogal == 'e'
                    || vogal == 'i'
                    || vogal == 'o'
                    || vogal == 'u') {

                iniciaVogal++;

            }

        }

        JOptionPane.showMessageDialog(null, "Informações"
                + "\nNomes Cadastrados: " + texto
                + "\nMaior Nome: " + maiorNome
                + "\nMenor Nome: " + menorNome
                + "\nQuantidade Paulo: " + paulo
                + "\nQuantidade Ana: " + ana
                + "\nQuantidade de Nomes que começam com vogais: " + iniciaVogal);

    }

}
