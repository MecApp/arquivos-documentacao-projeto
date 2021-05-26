package ProjetoIntegrador;//pacote conforme boas praticas

/**
 *
 * @author gessi
 */
//classe serviços, onde armazenará os dados dos serviços prestados pelo prestador
public class Servicos {
    
    private String nomeServico;
    private String descricao;

//construtor da classe
    public Servicos(String nomeServico, String descricao) {
        this.nomeServico = nomeServico;
        this.descricao = descricao;
    }
    
 //metodos get e set
    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
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
    
    public void alterarNome(){
         System.out.println("metodo em construção ");
        
    }
    
    public void alterarDescricao(){
         System.out.println("metodo em construção ");
            
    }

    //toString
    @Override
    public String toString() {
        return "Servicos{" + "nomeServico=" + nomeServico + ", descricao=" + descricao + '}';
    }
}
