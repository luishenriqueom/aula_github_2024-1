class Conta {
    private double saldo;
    private ArrayList<Transacao> transacoes;

    public Conta() {
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public void gerarRelatorioTransacoes() {
        System.out.println("Relatório de transações para o cliente " + cliente.getNome() + ":");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao.getDescricao() + ": " + transacao.getValor());
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
