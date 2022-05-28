import javax.swing.JOptionPane;

// Escreva um programa em C, que leia uma string, gere uma nova string com o texto invertido e imprima esta nova string.
public class exercicio77 {
    public static void main(String[] args) {
        String texto = "";
        String novoTexto = "";
        texto = JOptionPane.showInputDialog("Insira seu texto");

        StringBuilder inversor = new StringBuilder(texto).reverse();
        novoTexto = inversor.toString();
        
        JOptionPane.showMessageDialog(null, "Texto original: " + texto + "\nTexto invertido: " + novoTexto);
    }
}
