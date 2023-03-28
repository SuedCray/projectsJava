import java.util.Random;
import java.util.Scanner;

public class NumAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(20);
        Scanner scanner = new Scanner(System.in);
        int tentativa = -1;
        while (tentativa != numeroAleatorio) {
            System.out.print("Digite um número entre 0 e 20: ");
            tentativa = scanner.nextInt();
            if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("Parabéns, você acertou!");
            }
        }
    }
}