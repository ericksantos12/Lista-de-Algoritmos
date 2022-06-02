/*
Escreva um programa que gere uma string composta pelo último nome, seguido de
virgula e as iniciais dos demais nomes (em ordem), seguida de ponto. Por exemplo, se a
string entrada for “Gabriel Garcia Marquez”, a string gerada deve ser “Marquez, G. G.”.
*/
package extra;

import javax.swing.JOptionPane;
public class exercicio89 {
    public static void main(String[] args) {
        String nome = "";

        nome = JOptionPane.showInputDialog("Insira seu nome");
        
        JOptionPane.showMessageDialog(null, converteNome(nome));
    }

    static String converteNome(String nome){
        String[] nomeSeparado = nome.split(" ");;
        String texto = "";

        texto += nomeSeparado[nomeSeparado.length - 1] + ", ";

        for (int i = 0; i < nomeSeparado.length - 1; i++) {
            texto += nomeSeparado[i].charAt(0) + ". ";
        }

        return texto;
    }
    
}
