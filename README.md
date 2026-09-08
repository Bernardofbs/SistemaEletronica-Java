# Sistema de Controle de Estoque CLI

Meu primeiro projeto da matéria de Desenvolvimento de Sistemas Aplicados.
Um sistema simples de gerenciamento de estoque via linha de comando (CLI) desenvolvido em Java, aplicando conceitos de Orientação a Objetos (POO). 

## Objetivo
Este projeto simula o *back-end* de um controle de inventário para componentes eletrônicos. Ele demonstra a separação de responsabilidades entre a lógica de negócios e a interface de interação com o usuário.

## Funcionalidades
* **Cadastro de Itens:** Instanciação de componentes com atributos específicos (nome, tipo, preço, quantidade).
* **Atualização Dinâmica:** Alteração de valores unitários em tempo de execução.
* **Validação de Pedidos:** Cruzamento de dados entre a demanda do usuário e o estoque disponível, com baixa automática de inventário.
* **Tratamento de Strings:** Busca inteligente de itens ignorando *case sensitivity*.

## Tecnologias Utilizadas
* **Java:** Lógica principal e estruturação OO.
* **Scanner (java.util):** Gerenciamento de buffers e leitura de I/O no terminal.

## Aprendizados e Estrutura
O projeto foi estruturado em três camadas:
1. `Main.java`: Ponto de entrada (Entry Point).
2. `Menu.java`: Controlador de interface, responsável por capturar as intenções do usuário e rotear os comandos.
3. `Componente.java`: Entidade isolada e encapsulada, garantindo a integridade do estado e das regras matemáticas de baixa de estoque.
