package enviando.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private String userName = "jhonatanemailformacaojavaweb@gmail.com";
	private String senha = "JH.08.28.97";

	 @org.junit.Test
	public void testeEmail() {
		try {
		 
		/*Olhe as configurações smtl do seu email*/
		 
		 Properties properties = new Properties();
		 properties.put("mail.smtp.auth", "true"); /*Autorização*/
		 properties.put("mail.smtp.starttls", "true"); /*Autenticação*/
		 properties.put("mail.smtp.host", "smtp.gmail.com"); /*Servidor gmail Google*/
		 properties.put("mail.smtp.port", "465");  /*Porta do servidor*/
		 properties.put("mail.smtp.socketFactory.port", "465");  /*Expecifica a porta a ser conectada pelo socket*/
		 properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");  /*Class socket de conexão ao SMTP*/
		
		Session session = Session.getInstance(properties, new  Authenticator() {
		
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
			}
		});
		
		System.out.println(session);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
