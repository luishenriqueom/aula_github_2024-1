import java.util.ArrayList;

class Conta {
    private Cliente cliente;
    private double saldo;
    private ArrayList<Transacao> transacoes;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public void realizarSaque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add(new Transacao("Saque", -valor));
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void cadastrarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void abrirConta() {
        System.out.println("Conta aberta para o cliente " + cliente.getNome() + ".");
    }

    //Add transações

}
