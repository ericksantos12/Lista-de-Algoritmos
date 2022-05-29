// Faça um programa em C para ler valores e armazená-los em uma matriz D 5 x 5. A seguir o programa deverá calcular a soma dos valores que compõem a diagonal principal e a diagonal secundária da matriz.

import javax.swing.JOptionPane;
public class exercicio93 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int soma1 = 0;
        int soma2 = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número (i = " + i + ", j = " + j + ")"));
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    soma1 += matriz[i][j];
                }
                if (i + j == 4) {
                    soma2 += matriz[i][j];
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Soma da diagonal principal: " + soma1 + "\nSoma da diagonal secundária: " + soma2);
    }
}
