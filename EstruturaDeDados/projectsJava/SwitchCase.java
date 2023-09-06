public class SwitchCase {
    public static void main(String[] args) {

        String tipoCabelo = "branco";

        switch(tipoCabelo){
            case "amarelo":
                System.out.println("você é loiro");
            case "preto":
                System.out.println("Você é moreno");
            case "Vermelho";
                System.out.println("Você é ruivo");
            case "Calvo":
                System.out.println("Você é da tropa dos calvos");
        }
    }

    public static void nota(String[] args) {
        int nota = 7;

        switch(nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("Reprovado direto.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Deve fazer o exame.");
                break;
            case 6:
            case 7:
                System.out.println("Não fez mais do que a obrigação.");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Excelente!");
                break;
            default:
                System.out.println("Nota inválida.");
        }
}
