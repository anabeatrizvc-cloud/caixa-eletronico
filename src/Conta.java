public class Conta {

    private String agencia;
    private String numero;
    private Double saldo;
    private String nome;
    private String cpf;


    public Conta(
            String agencia,
            String numero,
            Double saldo,
            String nome,
            String cpf
    ){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void depositar(Double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(Double valor) {
        this.saldo = this.saldo - valor;
    }

    public Double consultar() {
        return this.saldo;
    }
}
