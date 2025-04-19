import java.util.ArrayList;
import java.util.Scanner;

public class at7 {

    public static void main(String[] args) {
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();
        ArrayList<String> unidades = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Alterar Produto");
            System.out.println("3. Excluir Produto");
            System.out.println("4. Realizar Venda");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    cadastrarProduto(codigos, nomes, valores, unidades, input);
                    break;
                case 2:
                    alterarProduto(codigos, nomes, valores, unidades, input);
                    break;
                case 3:
                    excluirProduto(codigos, nomes, valores, unidades, input);
                    break;
                case 4:
                    realizarVenda(codigos, nomes, valores, unidades, input);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void cadastrarProduto(ArrayList<Integer> codigos, ArrayList<String> nomes, 
                                        ArrayList<Double> valores, ArrayList<String> unidades, Scanner input) {
        System.out.println("\nCadastrar Novo Produto:");
        System.out.print("Código do produto: ");
        int codigo = input.nextInt();
        input.nextLine();   
        
        System.out.print("Nome do produto: ");
        String nome = input.nextLine();
        
        System.out.print("Valor unitário do produto: ");
        double valor = input.nextDouble();
        
        input.nextLine();   
        System.out.print("Tipo de unidade (ex: kg, unidade, litro): ");
        String unidade = input.nextLine();
        
        codigos.add(codigo);
        nomes.add(nome);
        valores.add(valor);
        unidades.add(unidade);
        
        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void alterarProduto(ArrayList<Integer> codigos, ArrayList<String> nomes, 
                                      ArrayList<Double> valores, ArrayList<String> unidades, Scanner input) {
        System.out.print("Digite o código do produto para alterar: ");
        int codigo = input.nextInt();
        
        int index = -1;
        for (int i = 0; i < codigos.size(); i++) {
            if (codigos.get(i) == codigo) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Produto não encontrado.");
        } else {
            input.nextLine();  
            
            System.out.print("Novo nome do produto: ");
            nomes.set(index, input.nextLine());
            
            System.out.print("Novo valor unitário do produto: ");
            valores.set(index, input.nextDouble());
            
            input.nextLine();  
            
            System.out.print("Novo tipo de unidade: ");
            unidades.set(index, input.nextLine());
            
            System.out.println("Produto alterado com sucesso!");
        }
    }

    public static void excluirProduto(ArrayList<Integer> codigos, ArrayList<String> nomes, 
                                      ArrayList<Double> valores, ArrayList<String> unidades, Scanner input) {
        System.out.print("Digite o código do produto para excluir: ");
        int codigo = input.nextInt();
        
        int index = -1;
        for (int i = 0; i < codigos.size(); i++) {
            if (codigos.get(i) == codigo) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Produto não encontrado.");
        } else {
            codigos.remove(index);
            nomes.remove(index);
            valores.remove(index);
            unidades.remove(index);
            
            System.out.println("Produto excluído com sucesso!");
        }
    }

    public static void realizarVenda(ArrayList<Integer> codigos, ArrayList<String> nomes, 
                                      ArrayList<Double> valores, ArrayList<String> unidades, Scanner input) {
        System.out.println("\nLista de Produtos Disponíveis:");
        for (int i = 0; i < codigos.size(); i++) {
            System.out.println("Código: " + codigos.get(i) + " | Nome: " + nomes.get(i) + 
                               " | Valor Unitário: R$ " + valores.get(i) + " | Unidade: " + unidades.get(i));
        }
        
        System.out.print("Digite o código do produto para a venda: ");
        int codigoProduto = input.nextInt();
        
        int index = -1;
        for (int i = 0; i < codigos.size(); i++) {
            if (codigos.get(i) == codigoProduto) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Produto não encontrado.");
        } else {
            System.out.print("Digite a quantidade que deseja comprar: ");
            int quantidade = input.nextInt();
            double total = valores.get(index) * quantidade;
            System.out.println("Total da venda: R$ " + total);
            
            System.out.println("\nEscolha a forma de pagamento:");
            System.out.println("1. Pix");
            System.out.println("2. Cartão");
            System.out.println("3. Dinheiro");
            System.out.print("Escolha uma opção: ");
            int pagamento = input.nextInt();
            
            switch (pagamento) {
                case 1:
                    System.out.println("Pagamento via Pix. Código do Pix: 123456789");
                    break;
                case 2:
                    System.out.println("Pagamento via Cartão. Digite os dados do cartão.");
                    System.out.print("Número do cartão: ");
                    input.nextLine();
                    String numeroCartao = input.nextLine();
                    System.out.print("Data de validade: ");
                    String validade = input.nextLine();
                    System.out.println("Pagamento aprovado!");
                    break;
                case 3:
                    System.out.print("Digite o valor pago: ");
                    double valorPago = input.nextDouble();
                    if (valorPago >= total) {
                        double troco = valorPago - total;
                        System.out.println("Troco: R$ " + troco);
                    } else {
                        System.out.println("Valor insuficiente!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        input.close();
    }
}
