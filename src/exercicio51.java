/**
 * A série de Fibonacci é formada pela sequencia: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 * Escreva um programa que gere a série de FIBONACCI até o N-ésimo termo (com N sendo uma entrada do algoritmo). 
 */
import javax.swing.JOptionPane;
public class exercicio51 {
    public static void main(String[] args) {
        int termo = 0;
        String serie = "";

        termo = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor N"));

        // Laço de repetição que calcula a série de Fibonacci
        for (int i = 0; i < termo; i++){
            serie = serie + fibonacci(i) + ", ";
        }

        JOptionPane.showMessageDialog(null, "Série Fibonacci de " + termo + " numeros:\n" + serie);
    }

    static int fibonacci(int n){
        // Calcula o n-ésimo termo da série de Fibonacci
        // O n-ésimo termo da série de Fibonacci é o n-ésimo termo da soma dos dois termos anteriores        
        if (n < 2){
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
