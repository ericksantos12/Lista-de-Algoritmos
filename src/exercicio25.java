import javax.swing.JOptionPane;

// Escreva um programa que leia o número equivalente ao mês e imprima a quantidade de dias deste mês.
public class exercicio25 {
    public static void main(String[] args) {
        int mes = 0;

        mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês"));

        if ((mes % 2) == 0) {
            JOptionPane.showMessageDialog(null, "O mês possui 30 dias");
        }
        else {
            JOptionPane.showMessageDialog(null, "O mês possui 31 dias");
        }
    }
}
