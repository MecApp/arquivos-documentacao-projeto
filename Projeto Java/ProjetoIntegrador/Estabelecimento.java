package ProjetoIntegrador; //pacote conforme boas praticas

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author gessi
 */
//classe Estabelecimento, armazenará os dados do estabelecimento do usuario prestador, por isso estende da classe UsuarioPrestador
public class Estabelecimento {
    
    private String nomeEstabelecimento;
    private String cnpj;
    private String telefoneEstabelecimento;
    private List<String> dados = new ArrayList<>();

//construtor principal

    public Estabelecimento(String nomeEstabelecimento, String cnpj, String telefoneEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.cnpj = cnpj;
        this.telefoneEstabelecimento = telefoneEstabelecimento;
    }
    

//metodos padrões   
    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefoneEstabelecimento() {
        return telefoneEstabelecimento;
    }

    public void setTelefoneEstabelecimento(String telefone) {
        this.telefoneEstabelecimento = telefone;
    }
    
 //metodos da classe
    
    public String pesquisarEstabelecimento(String nomeEstabelecimento) {
	for(int i = 0; i<dados.size(); i++) {
            if(dados.get(i) == nomeEstabelecimento) {
		return nomeEstabelecimento;
            }	

          }
		return null;
       }         
    
    public void cadastrarEstabelecimento(String nomeEstabelecimento){            
    
            var pesquisa = pesquisarEstabelecimento(nomeEstabelecimento);
            if(pesquisa != null) {
		System.out.println("O Estabelecimento ja consta no sistema ");
        
      }
         
    }

     public void adicionarEstabelecimento(String nomeEstabelecimento) {
        var pesquisa = pesquisarEstabelecimento(nomeEstabelecimento);
            if(pesquisa != null) {
		System.out.println("O Estabelecimento ja consta no sistema! ");
        
      }
      	
            else {
                dados.add(nomeEstabelecimento);
                System.out.println("-------------------------------------------------------------");
		System.out.println("O estabelecimento " + nomeEstabelecimento + " foi cadastrado com sucesso! ");
                System.out.println("-------------------------------------------------------------");
            }
        }
	
    public void editarInformacoes(){
        System.out.println("Metodo em construção");        
    }

//toString

    @Override
    public String toString() {
        return "Estabelecimento{" + "Estabelecimento= " + nomeEstabelecimento + ", CNPJ= " + cnpj + ", Telefone do Estabelecimento= " + telefoneEstabelecimento + ", dados= " + dados + '}';
    }
    
    
    }
    
