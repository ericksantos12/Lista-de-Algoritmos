import javax.swing.JOptionPane;

// Sendo  S = 1 + 1/2² + 1/3³ + 1/4⁴ + 1/5⁵ + 1/6⁶ + 1/N^N
// Um somatório de N (informado pelo usuário) termos, escreva um programa para calcular S para um número N.
public class exercicio57 {
    public static void main(String[] args) {
        double termo = 0.00;
        double fracao = 0.00;
        double somatorio = 0.00;

        termo = Double.parseDouble(JOptionPane.showInputDialog("Insira um número N"));

        for (int i = 1; i <= termo; i++){
            fracao = 1 / Math.pow(i, i);

            System.out.println(somatorio + " + " + fracao);
            somatorio = somatorio + fracao;
            
            System.out.println("-> " + somatorio + "\n");
            
        }

        JOptionPane.showMessageDialog(null, "O somatório é: " + somatorio);
    }
}
