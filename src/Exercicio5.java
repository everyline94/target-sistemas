import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //5) Escreva um programa que inverta os caracteres de um string.
        //
        //
        //
        //IMPORTANTE:
        //
        //a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
        //
        //b) Evite usar funções prontas, como, por exemplo, reverse;


        Scanner leitor = new Scanner(System.in);
        String entrada = leitor.next();
        String saida = "";

        for (int i= entrada.length() -1; i>=0; i--) {
            saida = saida + entrada.charAt(i);
        }
        System.out.println(saida);

        leitor.close();
    }
}
