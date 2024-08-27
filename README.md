# Banco digital 🏦
## Descrição do desafio da DIO
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

 O desafio consiste na criação de um banco digital através do uso de Java e POO. Através deste projeto, exploramos os pilares de POO (Abstração, Encapsulamento, Herança e Polimorfismo) no contexto bancário.

 ## Classes e interfaces:

 - <b>Banco (Classe):</b> contém informações do banco e uma lista de contas, onde estas contas são de clientes (contém clientes). O banco pode visualizar todos seu clientes através do método `clientesDoBanco()`que verifica todos os seus clientes pelo CPF

 - <b>Cliente (Classe):</b> contém informações do cliente, e utiliza dos métodos `hashCode()` e `equals()` para definir que só pode existir um único CPF por cliente. Dois clientes distintos não podem ter o mesmo CPF

 - <b>IConta (Interface):</b> interface criada para fins de teste, não era necessária na aplicação. Definição de um contrato em que a classe que implementa esta interface deve seguir. Neste projeto a classe Conta implementa a interface IConta

 - <b>Conta (Superclasse):</b> contém informações de uma conta, e possibilita saque, depósito e transferência. Classe abstrata, pois o banco fornece aos seus clientes dois tipos de conta que são conta corrente e conta poupança. Não é possível instanciar um objeto desta classe

 - <b>ContaCorrente e ContaPoupanca (Subclasses):</b> classes que herdam da classe Conta. No projeto feito criamos um pequeno exemplo de sobrescrita do método `imprimirExtrato()` que possui implementações distintas para as subclasses ContaCorrente e ContaPoupanca. Um objeto da subclasse ContaCorrente executará o método `imprimirExtrato()` de uma forma, enquanto um objeto da subclasse ContaPoupanca executará o método `imprimirExtrato()` de outra forma

 - <b>Main (Classe): </b> criada para fins de testes
