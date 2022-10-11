import java.util.Scanner;

public class Exercicio9 {

    public static void main(String args[]) {
        // Transação de temperatura
        double temperaturaF;
        double temperaturaC;

        System.out.println("Programa de Temperatura, Bem-Vindo!");
        // 1) Ação do usuario: temperatura em Fahrenheit
        Scanner teclado = new Scanner(System.in);
        temperaturaF = teclado.nextDouble();
        teclado.close();
        // 2) Tarefa do programa: Transformar F em Celsius
        temperaturaC = 5 * ((temperaturaF - 32) / 9);
        // 3)
        System.out.print("A temperatura em Celsius é " + temperaturaC);

    }

}