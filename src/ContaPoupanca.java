public class ContaPoupanca extends ContaBancaria {
    public Integer diasRendimento;

    public void calcularNovoSaldo(double taxaRendimentos) {
        double novoSaldo = getSaldo() * taxaRendimentos;
        setSaldo(novoSaldo);
    }

    // Aqui, você precisa adicionar um construtor para inicializar o objeto ContaPoupanca.
    public ContaPoupanca(Integer diasRendimento) {
        this.diasRendimento = diasRendimento;
    }
}
