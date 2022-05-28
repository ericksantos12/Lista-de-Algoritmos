import javax.swing.JOptionPane;

// Escreva um algoritmo que leia 2 valores (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x=y=0).
public class exercicio33 {
    public static void main(String[] args) {
        float x = 0;
        float y = 0;

        x = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de x"));
        y = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor de y"));

        if (x > 0 && y > 0){
            JOptionPane.showMessageDialog(null, "O ponto está no primeiro quadrante");
        }
        else if (x < 0 && y > 0){
            JOptionPane.showMessageDialog(null, "O ponto está no segundo quadrante");
        }
        else if (x < 0 && y < 0){
            JOptionPane.showMessageDialog(null, "O ponto está no terceiro quadrante");
        }
        else if (x > 0 && y < 0){
            JOptionPane.showMessageDialog(null, "O ponto está no quarto quadrante");
        }
        else if (x == 0 && y != 0){
            JOptionPane.showMessageDialog(null, "O ponto está no eixo Y");
        }
        else if (x != 0 && y == 0){
            JOptionPane.showMessageDialog(null, "O ponto está no eixo X");
        }
        else {
            JOptionPane.showMessageDialog(null, "O ponto está na origem");
        }

    }
}
