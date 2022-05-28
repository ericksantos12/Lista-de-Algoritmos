import javax.swing.JOptionPane;

// Escreva um programa em C que leia duas string e informe se a primeira contém a segunda. 
public class exercicio80 {
    public static void main(String[] args) {
        String texto1 = "";
        String texto2 = "";

        texto1 = JOptionPane.showInputDialog("Insira o primeiro texto");
        texto2 = JOptionPane.showInputDialog("Insira o segundo texto");

        if(texto1.contains(texto2)){
            JOptionPane.showMessageDialog(null, "O texto 1 contém o texto 2");
        }
        else {
            JOptionPane.showMessageDialog(null, "O texto 1 não contém o texto 2");
        }
    }
}
