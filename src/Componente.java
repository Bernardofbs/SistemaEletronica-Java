//Não preciso usar scanner pq esse arquivo é apenas a "base" para o Menu executar
//Esse arquivo vai apenas ser o "manual de instruções" para o Menu executar
public class Componente {

    private String nome;
    private String tipo;
    private double valor_uni;
    private int quant_disp;

    //Instanciei a classe e criei os atributos.

    public Componente(String nome, String tipo, double valor_uni,  int quant_disp ){
        this.nome = nome;
        this.tipo = tipo;
        this.valor_uni = valor_uni;
        this.quant_disp = quant_disp;
    }
    //Criei o metodo iniciador e atribui as variaveis.

    public void alterarValorUnitario (double novoValor){
        this.valor_uni = novoValor;
    }
    //Criei o metodo de alterar o valor unitario.
    //Ele nao retorna nada (void), apenas atribui o valor novo ao valor antigo.

    public int getQuant_disp(){
        return quant_disp;
    }
    //Uso get para retornar o valor pq o atributo "quant_disp" é privado


    public String getNome() {
        return nome;
    }
}   //Uso get para retornar o valor pq o atributo "nome" é privado
