//Esse arquivo que vai dar as ordens. Componentes ensina a como executar
import java.util.Scanner;//agr vou usar essa biblioteca para ler entrada do teclado

public class Menu {
    private Scanner ler;
    private Componente comp_atual;

    //Instanciei a classe e criei os atributos.
    //O tipo Scanner vem da biblioteca.
    //O tipo Componente vem da outra classe que criei.

    public Menu() {
        this.ler = new Scanner(System.in);
    }

    //Criei o metodo para ler a entrada que o usuario vai inserir no teclado

    public void iniciarMenu() {
        int opcao = 0;//inicia o Menu com entrada = 0

        while (opcao != 4) {//Começa o loop para manter o Menu até o usuario terminar seus acessos
            System.out.println("\n====MENU DE PRINCIPAL====");
            System.out.println("Opção 1 - Cadastrar Componente");
            System.out.println("Opção 2 - Alterar o valor de um Componente");
            System.out.println("Opção 3 - Receber Pedido (Verificar Estoque)");
            System.out.println("Opção 4 - SAIR");
            System.out.print("Escolha uma opção: ");

            opcao = ler.nextInt();

            ler.nextLine();//Vai limpar o historico de entradas.

            switch (opcao) {//Vai acessar uma das 4 opções que o usuario colocou.
                case 1:
                    CadastrarComp();
                    break;
                case 2:
                    alterarValor();
                    break;
                case 3:
                    verificarPedido();
                    break;
                case 4:
                    System.out.println("MENU ENCERRADO");
                    break;
                default:
                    System.out.println("Opção inválida! Insira uma das 4 opções acima.");
            }
        }
        ler.close();
    }

    private void CadastrarComp() {//Inserir os atributos dos componentes

        System.out.print("Insira o nome do Componente: ");
        String nome = ler.nextLine();
        System.out.print("Insira o tipo de Componente: ");
        String tipo = ler.nextLine();
        System.out.print("Insira o valor unitario (preço por unidade) desse Componente: ");
        double preco = ler.nextDouble();
        System.out.print("Insira a quantidade disponível desse Componente: ");
        int qtd = ler.nextInt();

        //Cada entrada vai ser armazenada nessa ordem especifica, os nomes não importam, são apenas para facilitar a leitura

        comp_atual = new Componente(nome, tipo, preco, qtd);//Cria um novo Objeto tipo Componente reservado em um novo espaço de memória
        System.out.println("Novo Componente cadastrado com sucesso!");
    }

    private void alterarValor() {//Alterar os preços dos componentes
        if (comp_atual == null) {//verificar se o comp existe pq n da pra mudar o valor de algo não cadastrado
            System.out.println("Nenhum componente foi cadastrado ainda.");
            return;
        }
        System.out.print("Novo valor unitario para " + comp_atual.getNome() + ":R$ ");//getNome pq é privado e por causa da "CamelCase"
        double novoValor = ler.nextDouble();
        comp_atual.alterarValorUnitario(novoValor);//registra o valor ou altera
        System.out.println("Valor alterado!");
    }

    private void verificarPedido() {
        if (comp_atual == null) {//verificar se o comp existe pq n da pra pedir algo não cadastrado
            System.out.println("Nenhum componente foi cadastrado ainda.");
            return;
        }

        System.out.print("Digite o nome do componente pedido: ");
        String nomeBuscado = ler.nextLine();

        if (!nomeBuscado.equalsIgnoreCase(comp_atual.getNome())) { //verificar se o nome bate com o nome do componente. "!" é negação
            System.out.println("Componente '" + nomeBuscado + "' não encontrado no estoque.");
            return;
        }//"equalsIgnoreCase" para não diferenciar maiúsculo de minúsculo

        if (comp_atual.getQuant_disp() == 0) {//verifica se o estoque está vazio
            System.out.println("Seu estoque desse Componente está vazio!");
            return;
        }

        System.out.print("Quantidade desejada para o pedido: ");
        int qtdPedido = ler.nextInt();

        if (qtdPedido <= comp_atual.getQuant_disp()) {//verificar se o estoque está completo ou parcial com o pedido
            System.out.println("COMPLETO");
        } else {
            System.out.println("PARCIAL (Apenas " + comp_atual.getQuant_disp() + " unidades disponíveis)");
        }
    }
}




