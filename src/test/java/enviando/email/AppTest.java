package enviando.email;

/**
 * Unit test for simple App.
 */



public class AppTest {
	
	@org.junit.Test
	public void testEmail () throws Exception {
		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("jhonatanemailformacaojavaweb@gmail.com, jhonatanemailformacaojavaweb@gmail.com",
				                                           "Jhonatan Dev",
				                                           "Chegou o email enviado com Java",
				                                           "Você acaba de receber um e-mail enviado via Java");

		enviaEmail.enviarEmail();

	}
}
