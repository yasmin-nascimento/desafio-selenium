package formulariopage;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import Base.BaseTests;
import pages.FormPage;

public class FormPageTests extends BaseTests {
	
	
	
	@Test
	public void testPreencherFormulario () {
		carregarPaginaInicial();
		
		FormPage formpage = formulariopage;
		String nomeUsuario = "Ana Teste";
		String sobrenomeUsuario = "Teste Teste";
		String emailUsuario = "teste@teste.com";
		String senhaUsuario = "teste";
		
		formpage.preencherNome(nomeUsuario);
		formpage.preencherSobrenome(sobrenomeUsuario);
		formpage.preencherEmail(emailUsuario);
		formpage.preencherSenha(senhaUsuario);
		
		formpage.clicarBotaoEnviar();		
		
		//Validar dados
		
			
		assertThat(formpage.obterNome(), is (nomeUsuario));
		
		assertThat(formpage.obterSobrenome(), is (sobrenomeUsuario));
		
		assertThat(formpage.obterEmail(), is (emailUsuario));
		
		assertThat(formpage.obterSenha(), is (senhaUsuario));
		
		
		
		
	}
	
	//@Test
	//public void testValidarResultado () {
	//	int campo = 0;
	//	String campoNome_FormPage = formpage.obterCampoNome(campo);
	//	String campoSobrenome_FormPage = formpage.obterCampoSobrenome(campo);
	//	String campoEmail_FormPage = formpage.obterCampoEmail(campo);
	//	String campoSenha_FormPage = formpage.obterCampoSenha (campo);
	//	
	//	System.out.println(campoNome_FormPage);
	//	System.out.println(campoSobrenome_FormPage);
	//	System.out.println(campoEmail_FormPage);
	//	System.out.println(campoSenha_FormPage);
	//}
	
}
