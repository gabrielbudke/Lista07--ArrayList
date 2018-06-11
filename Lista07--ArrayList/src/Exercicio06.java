
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Budke
 */
public class Exercicio06 {
    
    public static void main(String[] args) {
        
        /*
        6. Desenvolver um algoritmo que crie um ArrayList para armazenar 
        números inteiros. Solicite ao usuário quinze números e ao final 
        apresente os números que estão armazenados no ArrayList.
        */
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for(int i = 0; i < 15; i++){
            
            while(true){
                try{
                    JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "° Número: ", 
                            null, JOptionPane.QUESTION_MESSAGE);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Entrado Inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }            
        }
        
        JOptionPane.showMessageDialog(null, numeros.size());
            
        
        
        
    }
    
}
