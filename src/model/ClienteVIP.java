package model;

public class ClienteVIP extends Cliente {
    private double desconto; // desconto padrão em %

    public ClienteVIP(String nome, String telefone, String email, double desconto) {
        super(nome, telefone, email);
        this.desconto = desconto;
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor - (valor * desconto / 100);
    }

    public double aplicarDescontoEspecial(double valor, double extra) {
        return valor - (valor * (desconto + extra) / 100);
    }

    @Override
    public String toString() {
        return "[Cliente VIP] " + super.toString() + " | Desconto: " + desconto + "%";
    }
}
