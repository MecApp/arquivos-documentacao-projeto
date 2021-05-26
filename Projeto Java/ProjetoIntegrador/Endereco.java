package ProjetoIntegrador;//pacote conforme boas praticas

/**
 *
 * @author gessi
 */
//classe endereço, onde armazenará os dados do endereço do estabelecimento
public class Endereco extends Estabelecimento {
    
    private int cep;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

 //construtor da classe
    public Endereco(int cep, String rua, int numero, String complemento, String bairro, String cidade, String estado, String nomeEstabelecimento, String cnpj, String telefoneEstabelecimento) {
        super(nomeEstabelecimento, cnpj, telefoneEstabelecimento);
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

//metodos padrões get e set    

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
 
// metodos da classe    
    public void validarCep(){
        System.out.println("metodo em construção ");
        
    }
    
    public void gravarEndereco(){
         System.out.println("metodo em construção ");
        
    }
    
    public void buscarLocalizacao(){
         System.out.println("metodo em construção ");
    }
 
 // toString   

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", rua=" + rua + ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
    
}
