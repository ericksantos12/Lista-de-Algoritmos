/*
Escrever um algoritmo que leia uma matriz de valores
inteiros 6 por 6 e um valor inteiro qualquer, posteriormente multiplicar a matriz pelo
valor lido e colocar o resultado na própria matriz.
*/

import javax.swing.JOptionPane;
public class exercicio94 {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        int valor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor (i: " + i + ", j: " + j + ")"));
            }
        }

        valor = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = matriz[i][j] * valor;
                JOptionPane.showMessageDialog(null, "Valor da coordenada " + i + ", " + j + " = "+ matriz[i][j]);
            }
        }

    }
}
