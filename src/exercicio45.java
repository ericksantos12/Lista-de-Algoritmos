// * Escreva um programa que leia 5 números, e imprima a média entre eles.

import javax.swing.JOptionPane;
public class exercicio45 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, n5, media;

        n1 = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor (1)"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor (2)"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor (3)"));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor (4)"));
        n5 = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor (5)"));

        media = (n1 + n2 + n3 + n4 + n5) / 5;

        JOptionPane.showMessageDialog(null, "A média entre os valores é " + media);
    }
}
