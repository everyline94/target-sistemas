import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        //1) Observe o trecho de código abaixo:
        //
        //int INDICE = 13, SOMA = 0, K = 0;
        //
        //enquanto K < INDICE faça
        //
        //{
        //
        //K = K + 1;
        //
        //SOMA = SOMA + K;
        //
        //}
        //
        //imprimir(SOMA);
        //
        //
        //
        //Ao final do processamento, qual será o valor da variável SOMA?

        int indice = 13;
        var soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);


    }
}