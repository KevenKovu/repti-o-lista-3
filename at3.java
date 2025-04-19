import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class at3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int media= 0, idade , altura,M90m150=0, totalM190=0,entre1030mais190=0;
        float peso;
        List<Integer> idades = new ArrayList<>();
        List<Float> pesos = new ArrayList<>();
        List<Integer> alturas = new ArrayList<>();

        System.out.println("Escreva idades, pesos e alturas(cm) a seguir: ");
        for (int i =0 ; i <10; i++){
            idade = input.nextInt();
            idades.add(idade);
            media+=idade;
            peso = input.nextFloat();
            pesos.add(peso);
            altura= input.nextInt();
            alturas.add(altura);
            if(peso>90 && altura<150){
                M90m150+=1;
            }
            if (altura>190){
                totalM190+=1;
                if ( idade>=10&& idade<=30) {
                    entre1030mais190+=1;
                }
            }
            System.out.println("Escreva idades, pesos e alturas(cm) a seguir: ");

        }
        System.out.println("Media de idades"+(media/10));
        System.out.println("Total que possui superior a 90 kg e altura inferior a 1,50 metro" +M90m150);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre aquelas que medem mais de\r\n" + //
                        "1,90 m"+((entre1030mais190/totalM190)*100));



        System.out.println("Deseja ver os dados? (S/N)");
        String dados = input.next();
        if (dados.toUpperCase().equals("S")){
            System.out.println("Idades \n"+idades);
            System.out.println("Pesos: \n"+pesos);
            System.out.println("Alturas: "+alturas);
        }
        input.close();
    }
}
