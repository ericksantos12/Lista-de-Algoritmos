import javax.swing.JOptionPane;

// Escreva um programa em C, que gere a substring de uma string original, dado a posição inicial e a final da substring.
public class exercicio83 {
    public static void main(String[] args) {
        String texto = "";
        int pos1 = 0, pos2 = 0;
        String subString = "";

        texto = JOptionPane.showInputDialog("Insira um texto");
        pos1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira posição"));
        pos2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda posição"));

        subString = texto.substring(pos1, pos2);
        JOptionPane.showMessageDialog(null, "String original: " + texto + "\nSubString: " + subString);
    }
}
