import java.util.Scanner;

public class RecargaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Recarga recarga1 = new Recarga();

        System.out.println("Digite o valor da recarga");
        recarga1.num = sc.nextLine();
        System.out.println("Digite o seu nome");
        recarga1.nome = sc.nextLine();

        System.out.println("o valor da recarga é :"  + recarga1.num + "\n" + " E o seu nome é: " + recarga1.nome );


    }
}
