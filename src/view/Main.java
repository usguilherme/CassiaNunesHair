package view;

import java.util.Scanner;
import controller.Cadastro;
import model.Cliente;
import model.ClienteComum;
import model.ClienteVIP;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        int opcao;

        do {
            System.out.println("\n--- SALÃO DE BELEZA ---");
            System.out.println("1 - Cadastrar Cliente Comum");
            System.out.println("2 - Cadastrar Cliente VIP");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Buscar Cliente");
            System.out.println("5 - Remover Cliente");
            System.out.println("6 - Registrar Gasto");
            System.out.println("7 - Calcular Valor com Desconto");
            System.out.println("8 - Média de Gastos");
            System.out.println("9 - Atualizar Contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome1 = sc.nextLine();
                    System.out.print("Telefone: ");
                    String tel1 = sc.nextLine();
                    System.out.print("Email: ");
                    String email1 = sc.nextLine();
                    cadastro.adicionarCliente(new ClienteComum(nome1, tel1, email1));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome2 = sc.nextLine();
                    System.out.print("Telefone: ");
                    String tel2 = sc.nextLine();
                    System.out.print("Email: ");
                    String email2 = sc.nextLine();
                    System.out.print("Desconto padrão (%): ");
                    double desc = sc.nextDouble();
                    sc.nextLine();
                    cadastro.adicionarCliente(new ClienteVIP(nome2, tel2, email2, desc));
                    break;

                case 3:
                    for (Cliente c : cadastro.listarClientes())
                        System.out.println(c);
                    break;

                case 4:
                    System.out.print("Nome: ");
                    String busca = sc.nextLine();
                    Cliente encontrado = cadastro.buscarPorNome(busca);
                    System.out.println(encontrado != null ? encontrado : "Cliente não encontrado.");
                    break;

                case 5:
                    System.out.print("Nome: ");
                    String nomeRemover = sc.nextLine();
                    boolean removido = cadastro.removerCliente(nomeRemover);
                    System.out.println(removido ? "Removido com sucesso." : "Cliente não encontrado.");
                    break;

                case 6:
                    System.out.print("Nome: ");
                    String nomeGasto = sc.nextLine();
                    System.out.print("Valor gasto: R$ ");
                    double valorGasto = sc.nextDouble();
                    sc.nextLine();
                    cadastro.registrarGasto(nomeGasto, valorGasto);
                    break;

                case 7:
                    System.out.print("Nome: ");
                    String nomeDesconto = sc.nextLine();
                    Cliente cliente = cadastro.buscarPorNome(nomeDesconto);
                    if (cliente != null) {
                        System.out.print("Valor do serviço: R$ ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        if (cliente instanceof ClienteVIP) {
                            ClienteVIP vip = (ClienteVIP) cliente;
                            System.out.print("Aplicar desconto especial? (s/n): ");
                            String resp = sc.nextLine();
                            if (resp.equalsIgnoreCase("s")) {
                                System.out.print("Percentual extra: ");
                                double extra = sc.nextDouble();
                                sc.nextLine();
                                System.out.println("Valor final: R$ " + vip.aplicarDescontoEspecial(valor, extra));
                            } else {
                                System.out.println("Valor final: R$ " + vip.calcularDesconto(valor));
                            }
                        } else {
                            System.out.println("Valor final: R$ " + cliente.calcularDesconto(valor));
                        }
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 8:
                    System.out.println("Média de gastos: R$ " + cadastro.calcularMediaGastos());
                    System.out.println("Total de clientes: " + cadastro.contarClientes());
                    break;

                case 9:
                    System.out.print("Nome: ");
                    String nomeAtualizar = sc.nextLine();
                    Cliente c = cadastro.buscarPorNome(nomeAtualizar);
                    if (c != null) {
                        System.out.print("Novo telefone: ");
                        String novoTel = sc.nextLine();
                        System.out.print("Novo email: ");
                        String novoEmail = sc.nextLine();
                        c.atualizarContato(novoTel, novoEmail);
                        System.out.println("Contato atualizado com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
