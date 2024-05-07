import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
        int opcao = mainMenu.getSelection();
        
        switch (opcao) {
            case 1:
                // Lógica para cadastro de conta
                break;
            case 2:
                cadastrarCliente();
                break;
            case 3:
                // Lógica para operações
                break;
            default:
                System.out.println("Opção inválida!");
        }
        
        System.out.println("Fim");
    }

    private static void cadastrarCliente() {
        System.out.println("Cadastro de Cliente:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);
        System.out.println("Cliente cadastrado com sucesso:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
    }
}