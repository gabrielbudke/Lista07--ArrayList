
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Gabriel Budke
 */
public class Exercicio05 {

    public static void main(String[] args) {

        /*
         5. Solicite ao usuário quatro nomes e um outro nome, com esse nome, deve-se
         verificar se ele está contido o ArrayList ou não e esta informação deve ser
         apresentada ao usuário.
         */
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            while (true) {
                try {
                    nomes.add(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nomes: "));                    
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida",
                            null, JOptionPane.ERROR);
                }
            }

        }

        
        
        
    }

}
