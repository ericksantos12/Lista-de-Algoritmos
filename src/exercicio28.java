import javax.swing.JOptionPane;

// 28 - Escreva um programa que leia uma letra e mostre se ela é vogal ou consoante.
public class exercicio28 {
    public static void main(String[] args) {
        String letra;

        letra = JOptionPane.showInputDialog("Insira um caractere");
        letra = letra.toLowerCase();
        
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            JOptionPane.showMessageDialog(null, "A letra é uma vogal");
        }
        else {
            JOptionPane.showMessageDialog(null, "A letra é uma consoante");
        }
    }
}
