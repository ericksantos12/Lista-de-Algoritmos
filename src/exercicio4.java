// * Dado os três lados de um triângulo determinar o perímetro do mesmo. 

import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        float calculo;

        // Chama o metodo e armazena seu retorno
        calculo = calculaPerimetro();

        // Decisão que verifica se o valor retornado é maior que zero, se for, o triangulo é verdadeiro
        if (calculo > 0){
            JOptionPane.showMessageDialog(null, "O perímetro do triangulo é " + calculo);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Triangulo Invalido");
        }
    }
    
    static float calculaPerimetro() {
        /**
         * Metodo responsável pelo calculo do perimetro 
         */
        
        float cateto1, cateto2, hipotenusa, perimetro = 0;

        // Captura os valores
        cateto1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do primeiro cateto"));
        cateto2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor do segundo cateto"));
        hipotenusa = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da hipotenusa"));

        // Verifica se o triangulo é verdadeiro
        if ((cateto1 + cateto2) > hipotenusa){
            perimetro = cateto1 + cateto2 + hipotenusa;
        }
        else {
            perimetro = 0;
        }
        
        // Retorna o valor
        return perimetro;
    }
}
