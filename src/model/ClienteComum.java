package model;

public class ClienteComum extends Cliente {
    public ClienteComum(String nome, String telefone, String email) {
        super(nome, telefone, email);
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor; // sem desconto
    }

    @Override
    public String toString() {
        return "[Cliente Comum] " + super.toString();
    }
}
