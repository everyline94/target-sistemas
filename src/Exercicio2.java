import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int valorDigitado = sc.nextInt();
        System.out.println("valorDigitado: " + valorDigitado);
        int valorEsquerdo = 0;
        int valorDireito = 1;

        while ( valorDigitado > valorDireito ) {
            int proximoValor = valorEsquerdo + valorDireito;
            valorEsquerdo = valorDireito;
            valorDireito = proximoValor;
        }

        if(valorDigitado == valorDireito) System.out.println("pertence");
        else System.out.println("nao pertence");
    }
}

