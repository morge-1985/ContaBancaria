public class ContaBancaria {
    private String cliente;
    private Integer conta;
    private Double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean sacar(Double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public void realizarDeposito(Double valorDeposito) {
        saldo += valorDeposito;
    }
}
