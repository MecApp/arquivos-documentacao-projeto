package ProjetoIntegrador;//pacote conforme boas praticas

/**
 *
 * @author gessi
 */
//classe Avaliação Estabelecimento responsável por armazenar a avaliação dada pelo cliente
public class AvaliacaoEstabelecimento {
    private int avaliacao;
    private String descricao;

//construtor da classe
    public AvaliacaoEstabelecimento(int avaliacao, String descricao) {
        this.avaliacao = avaliacao;
        this.descricao = descricao;
    }
    
//métodos padrões get e set
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
 //metodos da classe   
    
    public void gravarDados(){
         System.out.println("metodo em construção ");
        
    }

    //toString
    @Override
    public String toString() {
        return "AvaliacaoEstabelecimento{" + "avaliacao=" + avaliacao + ", descricao=" + descricao + '}';
    }
    
    
}
