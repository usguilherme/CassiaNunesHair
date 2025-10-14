# Projeto Salão de Beleza - Java POO

Este projeto é um *sistema de gerenciamento de clientes de salão de beleza*, desenvolvido em *Java orientado a objetos (POO)*.  
Ele permite cadastrar clientes comuns e VIP, registrar gastos, calcular descontos, listar clientes e atualizar informações, usando conceitos de *herança, polimorfismo e pacotes*.

---

## Funcionalidades

1. *Cadastrar Clientes*
   - Cliente Comum
   - Cliente VIP (com desconto especial)

2. *Listar Clientes** 
   Mostra todos os clientes cadastrados, com nome, contato e gastos totais.

3. *Buscar Cliente por Nome* 
   Permite localizar rapidamente um cliente pelo nome.

4. *Remover Cliente*
   Remove um cliente do sistema.

5. *Registrar Gastos*  
   Adiciona o valor gasto por cada cliente, acumulando no total.

6. *Calcular Valor com Desconto*
   - Para clientes VIP: aplica desconto padrão e permite aplicar desconto extra especial.
   - Para clientes comuns: não há desconto.

7. *Atualizar Contato*
   - Permite alterar telefone e email de um cliente.

8. *Calcular Média de Gastos*  
   Retorna a média de gastos entre todos os clientes cadastrados.

---
## Estrutura de Pacotes

src/
├── model/ # Contém as classes Cliente, ClienteComum e ClienteVIP
├── controller/ # Contém a classe Cadastro que gerencia os clientes
└── view/ # Contém a classe Main com o menu interativo

- *model/*: representa os clientes e define comportamento (descontos, gastos, atualização de contato).  
- *controller/*: gerencia a lista de clientes, adicionando, removendo e calculando informações.  
- *view/*: interface interativa via console para o usuário operar o sistema.

---

## Tecnologias Utilizadas

- *Java SE 8 ou superior*  
- Programação Orientada a Objetos (POO)  
- Herança e Polimorfismo  
- IDEs suportadas: *VS Code* ou *Eclipse*

---

## Como Rodar

1. Abra o projeto em *VS Code* (com extensão *Java Extension Pack*) ou *Eclipse*.  
2. Certifique-se que a pasta `src` está configurada como *Source Folder*.  
3. Compile o projeto: os arquivos `.class` serão gerados automaticamente (pasta `bin` no VS Code).  
4. Execute a classe *view.Main* para acessar o *menu interativo*:

        TEXTO
--- SALÃO DE BELEZA ---
1 - Cadastrar Cliente Comum
2 - Cadastrar Cliente VIP
3 - Listar Clientes
4 - Buscar Cliente
5 - Remover Cliente
6 - Registrar Gasto
7 - Calcular Valor com Desconto
8 - Média de Gastos
9 - Atualizar Contato
0 - Sair