import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> nomesPacientes = new ArrayList<>();
        List<String> cpfs = new ArrayList<>();
        List<Integer> idades = new ArrayList<>();
        List<String> diagnosticos = new ArrayList<>();

        System.out.println("Quantos pacientes deseja cadastrar?");
        int total = input.nextInt();
        input.nextLine(); 
        // Cadastro
        for (int i = 0; i < total; i++) {
            System.out.println("Digite o nome:");
            String nome = input.nextLine();
            nomesPacientes.add(nome);

            System.out.println("Digite o CPF:");
            String cpf = input.nextLine();
            cpfs.add(cpf);

            System.out.println("Digite a idade:");
            int idade = input.nextInt();
            input.nextLine(); 
            idades.add(idade);

            System.out.println("Digite o diagnóstico do paciente:");
            String diagnostico = input.nextLine();
            diagnosticos.add(diagnostico);
            System.out.println("Paciente cadastrado com sucesso!\n");
        }
    }
}
