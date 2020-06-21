package formulariopage;

import static Base.BaseTests.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseTests;
import pages.FormPage;

public class FormPageTests extends BaseTests {

	@Test
	public void testPreencherFormulario() {
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

		// Validar dados
	
		assertThat(formpage.obterNome(), is(nomeUsuario));
		assertThat(formpage.obterSobrenome(), is(sobrenomeUsuario));
		assertThat(formpage.obterEmail(), is(emailUsuario));
		assertThat(formpage.obterSenha(), is(senhaUsuario));

		//formpage.clicarBotaoEnviar();

	}

}
