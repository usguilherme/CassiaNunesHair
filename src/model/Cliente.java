package model;

public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected String email;
    protected double gastoTotal;

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.gastoTotal = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void atualizarContato(String novoTelefone, String novoEmail) {
        this.telefone = novoTelefone;
        this.email = novoEmail;
    }

    public void registrarGasto(double valor) {
        this.gastoTotal += valor;
    }

    public double getGastoTotal() {
        return gastoTotal;
    }

    public abstract double calcularDesconto(double valor);

    @Override
    public String toString() {
        return "Nome: " + nome + " | Telefone: " + telefone + " | Email: " + email + " | Gasto total: R$ " + gastoTotal;
    }
}
