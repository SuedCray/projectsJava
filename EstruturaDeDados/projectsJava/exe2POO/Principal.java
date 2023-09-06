import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Paciente paciente1 = new Paciente();

        System.out.println("Digite o nome do paciente: ");
        paciente1.nome = sc.nextLine();
        System.out.println("Digite o rg do paciente: ");
        paciente1.rg = sc.nextLine();
        System.out.println("Digite o endereço do paciente: ");
        paciente1.endereço = sc.nextLine();
        System.out.println("Digite o telefone do paciente: ");
        paciente1.telefone = sc.nextLine();
        System.out.println("Digite a data de nascimento do paciente: ");
        paciente1.DataNascimento = sc.nextLine();
        System.out.println("Digite a profissão do paciente: ");
        paciente1.profissão = sc.nextLine();

        System.out.println("|||||||||||||||||||||||||| PACIENTE 1 |||||||||||||||||||||||||||||");

        System.out.println("nome: " + paciente1.nome + "\n" + "rg: " +paciente1.rg +"\n" + "endereço: " +paciente1.endereço + "\n" +
                paciente1.telefone + "\n" + "Data de nascimento: " + paciente1.DataNascimento + "\n" + "profissão" + paciente1.profissão );

        System.out.println("-------------------------PACIENTE 2 ------------------------");

        System.out.println("Digite o nome do paciente: ");
        String nome = sc.nextLine();

        Paciente paciente2 = new Paciente(nome);


        System.out.println("Digite o rg do paciente: ");
        paciente2.rg = sc.nextLine();
        System.out.println("Digite o endereço do paciente: ");
        paciente2.endereço = sc.nextLine();
        System.out.println("Digite o telefone do paciente: ");
        paciente2.telefone = sc.nextLine();
        System.out.println("Digite a data de nascimento do paciente: ");
        paciente2.DataNascimento = sc.nextLine();
        System.out.println("Digite a profissão do paciente: ");
        paciente2.profissão = sc.nextLine();

    }
}
