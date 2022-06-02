/*
Escreva um programa que leia um valor e imprima todas as possíveis combinações em
que o lançamento de um par de dados tenha como resultado da soma dos valores dos
dados o número lido. Por exemplo, se a entrada for o número 7, o programa deve
imprimir as seguintes combinações:
• 1 6
• 2 5
• 3 4
• 4 3
• 5 2
• 6 1
*/
package extra;

import java.util.Scanner;
public class exercicio50 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor = 0;

        System.out.print("Insira um valor: ");
        valor = ler.nextInt();
        
        System.out.println(jogarDados(valor));
    
    }

    static String jogarDados(int a){
        int[] dado1 = new int[]{1,2,3,4,5,6};
        int[] dado2 = new int[]{1,2,3,4,5,6};

        int resultado = 0;
        String texto = "";

        for (int i = 0; i < dado1.length; i++) {
            for (int j = 0; j < dado2.length; j++) {
                resultado = dado1[i] + dado2[j];

                if (resultado == a) {
                    texto += dado1[i] + " " + dado2[j] + "\n";
                }
            }
        }

        if (texto.equals("")){
            texto = "Nenhum dos dados deu o resultado";
            return texto;
        } else {
            return texto;
        }
    }
}
