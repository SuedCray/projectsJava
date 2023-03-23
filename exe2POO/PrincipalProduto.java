import java.util.Scanner;

public class PrincipalProduto {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto pr1 = new Produto();

        System.out.println("Digite a marca do produto");
        pr1.marca = sc.nextLine();
        System.out.println("Digite a marca do fabricante");
        pr1.fabricante = sc.nextLine();
        System.out.println("Digite o código de barras do produto");
        pr1.CodBarras = sc.nextLine();
        System.out.println("Digite o preço do produto");
        pr1.preco = sc.nextFloat();

        System.out.println("_____________Produto1_________________");

        System.out.println("a marca do produto um é "+pr1.marca+ "\n" +"a fabricante do produto é: " +pr1.fabricante + "\n"+
                "o código de barras vai ser: " + pr1.CodBarras + "\n" + " e o valor é: " + pr1.preco  );

    }
}
