package controller;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Cliente> clientes;

    public Cadastro() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarPorNome(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public boolean removerCliente(String nome) {
        Cliente c = buscarPorNome(nome);
        if (c != null) {
            clientes.remove(c);
            return true;
        }
        return false;
    }

    public void registrarGasto(String nome, double valor) {
        Cliente c = buscarPorNome(nome);
        if (c != null) {
            c.registrarGasto(valor);
        }
    }

    public double calcularMediaGastos() {
        if (clientes.isEmpty()) return 0;
        double total = 0;
        for (Cliente c : clientes) total += c.getGastoTotal();
        return total / clientes.size();
    }

    public int contarClientes() {
        return clientes.size();
    }
}
