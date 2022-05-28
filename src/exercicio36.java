/**
 * Em uma certificação são feitos são feitos 5 exames (I, II, III, IV e V). Escreva um programa que leia as notas destes exames e imprima a classificação do aluno, sabendo que a média é 70. 
 * A – passou em todos os exames;
 * B – passou em I, II e IV, mas não em III ou V;
 * C – passou em I e II, III ou IV, mas não em V.
 * Reprovado – outras situações.
 */

import javax.swing.JOptionPane;
public class exercicio36 {
    public static void main(String[] args) {
        float exame1 = 0, exame2 = 0, exame3 = 0, exame4 = 0, exame5 = 0;

        exame1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do exame I"));
        exame2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do exame II"));
        exame3 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do exame III"));
        exame4 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do exame IV"));
        exame5 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do exame V"));

        if(exame1 >= 70 && exame2 >= 70 && exame3 >= 70 && exame4 >= 70 && exame5 >= 70){
            JOptionPane.showMessageDialog(null, "O aluno está na classificação A");
        }
        else if(exame1 >= 70 && exame2 >= 70 && exame4 >= 70 && (exame3 < 70 || exame5 < 70)){
            JOptionPane.showMessageDialog(null, "O aluno está na classificação B");
        }
        else if(exame1 >= 70 && exame2 >= 70 && (exame3 >= 70 || exame4 >= 70) && exame5 < 70){
            JOptionPane.showMessageDialog(null, "O aluno está na classificação C");   
        }
        else {
            JOptionPane.showMessageDialog(null, "O aluno está reprovado");
        }
    }
}
