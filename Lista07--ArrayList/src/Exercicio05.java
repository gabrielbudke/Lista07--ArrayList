
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Budke
 */
public class Exercicio05 {

    public static void main(String[] args) {

        /*
         5. Solicite ao usuário quatro nomes e um outro nome, 
         com esse nome, deve-se verificar se ele está contido 
         no ArrayList ou não e esta informação deve ser apresentada ao usuário.
         */
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            //Try/Catch para validação de espaço vazio
            while (true) {
                try {
                    String nome = JOptionPane.showInputDialog(
                            "Cadastre o " + (i + 1) + "° nome: ").toUpperCase();

                    if (!nome.equals("")) {
                        nomes.add(nome);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Entrada Inválida");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Entrada Inválida");

                }
            }

        }

        String busca = JOptionPane.showInputDialog("Digite o nome para busca");

        for (int i = 0; i < nomes.size(); i++) {

            if (busca.equalsIgnoreCase(nomes.get(i))) {
                JOptionPane.showMessageDialog(null, "Nome encontrado!!");
                break;
            }
            
            JOptionPane.showMessageDialog(null, "Nome não encontrado");
            
                
        }
    }
}