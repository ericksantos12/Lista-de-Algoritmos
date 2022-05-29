// Faça um programa em C que leia um array de 20 inteiros e imprima o menor e o maior valor dentre os elementos do array.
import java.util.Arrays;
import javax.swing.JOptionPane;
public class exercicio64 {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o array (" + i + ")"));
        }
        
        JOptionPane.showMessageDialog(null, "O maior é: " + pegarMaior(array) + "\nO menor é: " + pegarMenor(array));
    }

    static int pegarMaior(int[] arr){
        // Ordena o array do menor para o maior e retorna o último valor baseado no tamanho dele
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    static int pegarMenor(int[] arr){
        // Ordena o array do menor para o maior e retorna o primeiro valor
        Arrays.sort(arr);
        return arr[0];
    }
}
