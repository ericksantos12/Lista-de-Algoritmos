import javax.swing.JOptionPane;

// Escreva um programa que calcule a raiz de uma equação do primeiro grau.

public class exercicio19 {
    public static void main(String[] args) {
        Double a = 0.0, b = 0.0, c = 0.0;
        Double delta = 0.0;
        Double x1 = 0.0;
        Double x2 = 0.0;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do coeficiente c: "));

        delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Delta: " + delta);

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "A equação não possui resultados reais");
        }        
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "O x¹ é: " + x1 + "\nO x² é: " + x2);
        }

    }
}
