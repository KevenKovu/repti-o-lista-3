import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class at5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();
        List<String> crms = new ArrayList<>();
        List<String> especialidades = new ArrayList<>();

        System.out.println("Quantos médicos deseja cadastrar?");
        int total = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha

        // Cadastro
        for (int i = 0; i < total; i++) {
            System.out.println("Digite o nome do médico:");
            String nome = input.nextLine();
            nomes.add(nome);

            System.out.println("Digite o CRM:");
            String crm = input.nextLine();
            crms.add(crm);

            System.out.println("Digite a especialidade:");
            String especialidade = input.nextLine();
            especialidades.add(especialidade);

            System.out.println("Médico cadastrado com sucesso!\n");
        }
        input.close();
    }
}