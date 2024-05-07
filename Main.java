import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Cadastrar Cliente", "Abrir Conta", "Realizar Saque", "Relatório de Transações"));
		int opcao = mainMenu.getSelection();
        
        switch (opcao) {
            case 1:                
			 	cadastrarCliente();
                break;
            case 2:
				abrirConta();
                break;
            case 3:
                realizarSaque();
                break;
			case 4:
                relatorioTransacoes();
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
private static void abrirConta() {
	System.out.println("Abrir Conta:");
	String nome = "João";
	String cpf = "123";

	Cliente cliente = new Cliente(nome, cpf);

	Conta conta = new Conta(cliente);

	conta.abrirConta();
}
private static void realizarSaque(){
	System.out.println("Saque:");
	String nome = "João";
	String cpf = "123";

	Cliente cliente = new Cliente(nome, cpf);

	Conta conta = new Conta(cliente);

	conta.realizarSaque(100.0);
}
private static void relatorioTransacoes(){
	System.out.println("Transações:");
	String nome = "João";
	String cpf = "123";

	Cliente cliente = new Cliente(nome, cpf);

	Conta conta = new Conta(cliente);

	conta.gerarRelatorioTransacoes();
}
}