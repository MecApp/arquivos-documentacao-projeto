package ProjetoIntegrador;//pacote conforme boas praticas

/**
 *
 * @author gessi
 */
public class Main {

	public static void main(String[] args) {
		
            
        //adicionar novo login
		Login v1 = new Login("pgarcia", "12345", "Paulo Garcia Santos","31985859898","paulogarcia@gmail.com.br", "cliente");
		Login v2 = new Login("mmarcia", "85475", "Maria Marcia Silveira", "85987415478", "mariamarciasilveira@autoeletricasilveira.com.br","prestador");
		
		
		v1.adicionarUsuario("paulogarcia@gmail.com.br");
		v2.adicionarUsuario("mariamarciasilveira@autoeletricasilveira.com.br");
	
		v1.exibirUsuarios();	
		v2.exibirUsuarios();	
              //v1.removerUsuario("paulogarcia@gmail.com.br"); - apenas teste do metodo
		
		System.out.println(v1);
		System.out.println(v2);
                
        //adicionar novo estabelecimento
            Estabelecimento e1 = new Estabelecimento("Auto Eletrica Silveira", "17.314.051/0001-90", "85987415478");
            Estabelecimento e2 = new Estabelecimento("Dois Irmãos Martelinho de Ouro", "41.815.426/0001-80", "31879878952");
            
            e1.adicionarEstabelecimento("Auto Eletrica Silveira");
            e2.adicionarEstabelecimento ("Dois Irmãos Martelinho de Ouro");
            
 		System.out.println(e1);
		System.out.println(e2);           
	}

}
