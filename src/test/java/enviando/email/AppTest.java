package enviando.email;

import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class AppTest {

	 @org.junit.Test
	public void testeEmail() {
		
		/*Olhe as configurações smtl do seu email*/
		 
		 Properties properties = new Properties();
		 properties.put("mail.smtp.auth", "true"); /*Autorização*/
		 properties.put("mail.smtp.starttls", "true"); /*Autenticação*/
		 properties.put("mail.smtp.host", "smtp.gmail.com"); /*Servidor gmail Google*/
		 properties.put("mail.smtp.port", "465");  /*Porta do servidor*/
		 properties.put("mail.smtp.socketFactory.port", "465");  /*Expecifica a porta a ser conectada pelo socket*/
		 properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");  /*Class socket de conexão ao SMTP*/
	}
}
