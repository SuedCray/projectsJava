import java.util.Scanner;

public class PrincipalCasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Casa casa1 = new Casa();
        System.out.println("Qual cor deseja sua sala?");
        casa1.pintura = sc.nextLine();

        System.out.println("Qual valor de sua casa");
        casa1.valor = sc.nextInt();

        System.out.println("Qual piso deseja em sua casa?");
        casa1.piso = sc.nextLine();

        System.out.println("Qual iluminação deseja");
        casa1.iluminação = sc.nextLine();

        System.out.println("_______casa1_______________");

        System.out.println("Essa foi sua escolha: " + casa1.pintura + casa1.valor + casa1.piso + casa1.iluminação+ "Que bela escolha você fez"  );

    }
}
