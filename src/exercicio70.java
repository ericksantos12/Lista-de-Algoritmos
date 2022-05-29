// Escreva um programa que carregue um array com tamanho variável. O tamanho máximo do array é de 100 posições (carga de array com sentinela).

import javax.swing.JOptionPane;
public class exercicio70 {
    public static void main(String[] args) {
        int[] array = new int[100];
        String saida = "";
        int tamanho = 0;

        for (int i = 0; i < 100; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número (-1 para sair)"));
            if (array[i] == -1) {
                break;
            } else {
                tamanho++;
            }
        }

        JOptionPane.showMessageDialog(null, "Tamanho do array: " + tamanho);

        for (int i = 0; i < tamanho; i++) {
            saida += array[i] + ", ";
        }

        JOptionPane.showMessageDialog(null, "Array: " + saida);
    }
}
