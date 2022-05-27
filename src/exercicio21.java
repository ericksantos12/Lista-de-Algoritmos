// * Escreva um programa que leia um número e exiba se ele é positivo ou negativo. 

import javax.swing.JOptionPane;

public class exercicio21 {
    public static void main(String[] args) {
        float numero = 0;

        numero = Float.parseFloat(JOptionPane.showInputDialog("Insira um número"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O número é positivo");
        }
        else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O número é negativo");
        }
        else {
            JOptionPane.showMessageDialog(null, "O número é neutro");
        }
    }
}
