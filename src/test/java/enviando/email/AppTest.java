package enviando.email;

/**
 * Unit test for simple App.
 */



public class AppTest {
	
	@org.junit.Test
	public void testEmail () throws Exception {
		
		StringBuilder stringBuilderTextEmail = new StringBuilder();
		stringBuilderTextEmail.append("Olá, <br/><br/>");
		stringBuilderTextEmail.append("Você está recebendo acesso <br/><br/>");
		stringBuilderTextEmail.append("Para ter acesso clique no botão abaixo. <br/><br/>");
		stringBuilderTextEmail.append("<b>Login:<b/> jhonatan.nuss.com.br <br/>");
		stringBuilderTextEmail.append("<b>Senha:<b/> 123458746 <br/><br/>");


		
		stringBuilderTextEmail.append("<a target=\"_blank\" href=\"www.jhonuss.dev\" style=\"color:#2525a7; padding: 14px 25px; text-align:center; text-decoration: none; display:inline-block; border-ridus:30px; font-size:20px; font-family:courier; border: 3px solid green; background-color:#99DA39;\">Acessar Portfólio</a><br/><br/>  ");

		
		stringBuilderTextEmail.append("<span style=\"fonte-size:8px\"> Ass: Jhonatan Nuss </span>");

		
		ObjetoEnviaEmail enviaEmail = new ObjetoEnviaEmail("jhonatanemailformacaojavaweb@gmail.com, jhonatanemailformacaojavaweb@gmail.com",
				                                           "Jhonatan Dev",
				                                           "Chegou o email enviado com Java",
				                                           stringBuilderTextEmail.toString());

		enviaEmail.enviarAnexol(true);

	}
}
