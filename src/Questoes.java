import java.util.Scanner;

public class Questoes {

    public void quest1() {
        int soma = 0, k = 0;
        for (int INDICE = 13; k < INDICE; k++) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }

    public void quest2() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sn.nextInt();
        boolean pertenceFibonacci = isFibonacci(num);

        System.out.println(num + (pertenceFibonacci ? " pertence" : " não pertence") + " à sequência de Fibonacci.");
    }

    private boolean isFibonacci(int num) {
        if (num == 0 || num == 1)
            return true;

        int anterior = 0, atual = 1;
        while (atual <= num) {
            int proximo = anterior + atual;
            if (proximo == num) {
                return true;
            }

            anterior = atual;
            atual = proximo;
        }

        return false;
    }

    public void quest5() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Digite a string para inverter: ");
        String texto = sn.nextLine();

        String textoInvertido = inverteString(texto);
        System.out.println("String invertida: " + textoInvertido);
    }

    private String inverteString(String texto) {
        char[] textoInvertidoChar = new char[texto.length()];
        for (int i = texto.length() - 1, j = 0; i >= 0; i--, j++) {
            textoInvertidoChar[j] = texto.charAt(i);
        }

        return new String(textoInvertidoChar);
    }
}
