package driverinstance;
import org.testng.annotations.Test;
import javax.mail.*;
import javax.mail.internet.*;

import java.util.Properties;

 
    
public class SendEmail 
{
	    private static String to = "test@test.com";
	    private static String subject = "Xap REport";
	    private static String body = "Body";
	    private static final String SMTP_HOST_NAME = "chiragqa050@gmail.com";
	    private static final int SMTP_HOST_PORT = 465;
	    private static final String SMTP_AUTH_USER = "chiragqa050@gmail.com";
	    private static final String SMTP_AUTH_PWD  = "C@#$2021";

	public static void main(String[] args) throws Exception{
        if(args.length != 3)
        {
            System.out.println("There must be three arguments :\n 1.email id to who you have to send mail \n 2. subject \n 3. body");
            System.exit(1);
         
        }
       to = args[0];
       subject = args[1];
       body = args[2];
       new SendEmail().test();    
    }
 
    @Test
	public void test() throws Exception{
        Properties props = new Properties();
 
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.host", SMTP_HOST_NAME);
        props.put("mail.smtps.auth", "true");
        // props.put("mail.smtps.quitwait", "false");
 
        Session mailSession = Session.getDefaultInstance(props);
        mailSession.setDebug(true);
        Transport transport = mailSession.getTransport();
 
        MimeMessage message = new MimeMessage(mailSession);
        message.setSubject(subject);
        message.setContent(body, "text/plain");
     
          
        message.addRecipient(Message.RecipientType.TO,
             new InternetAddress(to));
 
        transport.connect
          (SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER, SMTP_AUTH_PWD);
 
        transport.sendMessage(message,
            message.getRecipients(Message.RecipientType.TO));
        transport.close();
    }
}
		// TODO Auto-generated method stub

 
