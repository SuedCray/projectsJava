import java.util.Scanner;

public class PrincipalCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro();

        System.out.println("Digite a pintura do carro");
        carro1.pintura = sc.nextLine();
        System.out.println("digite a marca do carro");
        carro1.marca = sc.nextLine();
        System.out.println("Digite o ano do carro");
        carro1.ano = sc.nextInt();
        System.out.println("Digite o valor do carro");
        carro1.preco = sc.nextFloat();

        System.out.println("Carro 1 ---------------");

        System.out.println("A marca do carro é"+ "\n"+ carro1.marca + "a pintura do carro vai ser" + "\n" + carro1.pintura +
                "o ano do carro é"+ carro1.ano + "\n" + "o valor do carro é: " + carro1.preco  );

    }
}
