import java.util.Scanner;

public class at2 {
    public Float mediaarit(Scanner input){
        System.out.println("Escreva dois valores: ");
        float nota1 = input.nextFloat(), nota2 =input.nextFloat();
        return (nota1 + nota2)/2;


    }
    public Float mediapond(Scanner input){
        System.out.println("Dê três notas e seus respectivos pesos");
        System.out.println("Notas: ");
        float nota1 = input.nextFloat(), nota2 =input.nextFloat(), nota3 = input.nextFloat();
        System.out.println("Pesos:");
        int peso1 = input.nextInt(),peso2 = input.nextInt(),peso3 = input.nextInt();
        return ((nota1* peso1)+ (nota2*peso2)+ (nota3*peso3))/( peso1 +peso2+peso3) ;
    }
    public static void main(String[] args) {
        at2 caminho = new at2();
        Scanner input = new Scanner(System.in);
        int opc;
        while (true) {
            System.out.println("Opção 1: receber duas notas, calcular e mostrar a média aritmética.\r\n" + //
                                "Opção 2: receber três notas e seus respectivos pesos, calcular e mostrar média ponderada.\r\n" + //
                                "Opção 3: sair do programa.\r");
            opc = input.nextInt();
            switch (opc) {
                case 1: 
                    
                    float resposta1 = caminho.mediaarit(input);
                    System.out.println("O resultado da media é : "+resposta1);

                    break;
                case 2:
                    float resposta2 = caminho.mediapond(input);
                    System.out.println("O resultado da media ponderada é : "+resposta2);

                    break;
                case 3:
                    System.exit(opc);
                    break;
            
                default:
                    System.out.println("Valor inválido!");;
                    break;
            }

        }
    }
}
