import java.util.Scanner;

public class at1 {
    public String porcentagem(float C4,float C5,float C7,float C12){
        float total = C4+C5+C7+C12;
        C4 /=total;
        C5 /=total;
        C7/=total;
        C12 /=total;
        String retorno = "Tabela de audiência em relação aos 4 canais(%)\n"+"Canal 4 :"+(C4*100)+
            "\nCanal 5 : "+(C5*100)+ "\nCanal 7 : "+ (C7*100)+"\nCanal 12 : "+ (C12*100);

        return retorno;
       
    }
    public static void main(String[] args) {
        int opc=1,C4=0,C5=0,C7=0,C12=0;
        
        Scanner input = new Scanner(System.in);
        do {
        
            System.out.println("Digite o número do canal e quantas pessoas estão assistindo(canais 4,5,7,12;0 =sair): ");
            opc = input.nextInt();
            switch (opc) {
                case 4:
                    C4 += input.nextInt();
                    break;
                case 5:
                    C5 += input.nextInt();
                    break;
                case 7:
                    C7 += input.nextInt();
                    break;
                case 12:
                    C12 += input.nextInt();
                    break;
                default:
                    System.out.println("Valor inválido!");;
            }
            
        } while (opc!= 0);
        at1  canal = new at1();
        String resposta = canal.porcentagem(C4,C5,C7,C12);
        System.out.println(resposta);
        input.close();
    }
    
    
}
