package ProjetoIntegrador; //pacote conforme boas praticas

/**
 *
 * @author gessi
 */
//classe usuário, onde armazenará os dados pessoais do usuario e do prestador de serviços
public class UsuarioPrestador { 
    
   // atributos da classe
    private String nome;
    private String telefone;
    private String email;
    private String tipoUsuario;
  

    
    //construtor da classe
    public UsuarioPrestador(String nome, String telefone, String email, String tipoUsuario) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
    }

    //metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }    
    
    //metodos da classe
    public void gravarDados(){
        System.out.println("Metodo em construção");
    }
    
    public void editarPerfil(){
        System.out.println("Metodo em construção");        
    }
    
      
    //toString
     @Override
    public String toString() {
        return "UsuarioPrestador{" + "Nome= " + nome + ", Telefone= " + telefone + ", E-mail= " + email + ", Tipo de Usuario= " + tipoUsuario + '}';
    }
    
  
    
}
