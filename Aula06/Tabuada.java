import java.util.Scanner;

public class Tabuada {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número para ver sua tabuada: ");
            int numero = scanner.nextInt();
            System.out.println("Até qual número deseja realizar?");
            int verificacao = scanner.nextInt();

            int contador = 1;
            while (contador <= verificacao) {
                System.out.println(numero + " x " + contador + " = " + (numero * contador));
                contador++;
            }
        }
    }