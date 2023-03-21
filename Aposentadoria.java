public class Aposentadoria {
    public static void main(String[] args) {


        int mulher = 30;
        int contribuição = 11;
        int homem = 54;

        if(mulher >= 62 && contribuição >= 15 ){
            System.out.println("VocÊ pode aposentar");
        } else if(homem >=65 && contribuição >= 15 ){
            System.out.println("Aposentado por idade");
        }else if(contribuição > 35 && contribuição <= 57){
            System.out.println("Aposentado por tempo de serviço");
        }else if(contribuição> 35 && contribuição <= 60 ){
            System.out.println("Você pode aposentar");
        } else{
            System.out.println("Vai trabalhar vagabundo(a) ou binarie");
        }
    }
    }
