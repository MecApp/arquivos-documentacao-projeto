
package ProjetoIntegrador; //pacote conforme boas praticas

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author gessi
 */
//classe Login, uma extensão da classe usuario, e armazenará o login e senha do usuario
public class Login extends UsuarioPrestador {
    
// atributos da classe
    private String usuario;
    private String senha;
    private List<String> usu = new ArrayList<>();

//construtor da classe

    public Login(String usuario, String senha, String nome, String telefone, String email, String tipoUsuario) {
        super(nome, telefone, email, tipoUsuario);
        this.usuario = usuario;
        this.senha = senha;
    }

 
//metodos get e set
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//metodos da classe    
     
   public void redefinirSenha(){
        System.out.println("Metodo em construção");       
   }
    
    //metodos pesquisa, cadastro, remover usuario
    public String pesquisarUsuario(String usuario) {
	for(int i = 0; i<usu.size(); i++) {
            if(usu.get(i) == usuario) {
		return usuario;
            }	

	}
		return null;
    }

     public void cadastrarUsuario(String usuario){
        var pesquisa = pesquisarUsuario(usuario);
            if(pesquisa != null){
                System.out.println("O Usuário já esta cadastrado!");
            }
         
    }

     public void adicionarUsuario(String usuario) {
        var pesquisa = pesquisarUsuario(usuario);
            if(pesquisa != null) {
		System.out.println("O Usuário já esta cadastrado!");
        
      }
      	
            else {
                usu.add(usuario);
                System.out.println("-------------------------------------------------------------");
		System.out.println("O usuário " + usuario + " foi cadastrado com sucesso! ");
                System.out.println("-------------------------------------------------------------");
            }
        }
	
     public void removerUsuario(String usuario) {
        var pesquisa = pesquisarUsuario(usuario);
            if(pesquisa == null) {
		System.out.println("O Usuário já esta cadastrado!");

             } 
             
            else {
               usu.remove(usuario);
                System.out.println("-------------------------------------------------------------");
                System.out.println("email " + usuario + " foi desvinculado do sistema ");
                System.out.println("-------------------------------------------------------------");
		}
	
        }
        
        public void exibirUsuarios() {
                System.out.println("-------------------------------------------------------------");
		System.out.println("Os usuários cadastrados no sistema são: " + usuario);
                System.out.println("-------------------------------------------------------------");
		for(int i = 0; i < usu.size(); i++) {			
			System.out.println(usu.get(i));	
		} 
			}	
        
        
}


