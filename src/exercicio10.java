// Converter um inteiro informado menor que 32 para sua representação em binário

import javax.swing.JOptionPane;
public class exercicio10 {
    public static void main(String[] args) {
        int numero = 0;
        String binario = "";

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));

        if (numero < 32) {
            while (numero > 0) {
                binario = (numero % 2) + binario;
                numero = numero / 2;
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "O número é maior ou igual a 32");
        }

        JOptionPane.showMessageDialog(null, "O número em binário é: " + binario);
    }
}
