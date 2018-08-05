package emaildemo;

import java.io.File;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.security.Provider;
import java.security.Security;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class GoogleTests {

private static final String SMTP_HOST_NAME = "smtp.gmail.com";
private static final String SMTP_PORT = "465";
private static final String emailMsgTxt = "Test Message Contents";
private static final String emailSubjectTxt = "A test from gmail";
private static final String emailFromAddress = "kolipuja494@gmail.com";
private static final String SSL_FACTORY =
"javax.net.ssl.SSLSocketFactory";
private static final String[] sendTo = {"Siddheshpoo46@gmail.com","dollykapoor753@gmail.com"};

private static final String fileAttachment="C:/abc.txt";
private static int addProvider;
private static Provider provider;

public static void main(String args[]) throws Exception {


setAddProvider(Security.addProvider(provider));

new GoogleTests().sendSSLMessage(sendTo, emailSubjectTxt,
emailMsgTxt, emailFromAddress);
System.out.println("Sucessfully Sent mail to All Users");

}

public void sendSSLMessage(int recipients, String subject,
String message, String from)  {
boolean debug = true;

Properties props = new Properties();
props.put("mail.smtp.host", SMTP_HOST_NAME);
props.put("mail.smtp.auth", "true");
props.put("mail.debug", "true");
props.put("mail.smtp.port", SMTP_PORT);
props.put("mail.smtp.socketFactory.port", SMTP_PORT);
props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
props.put("mail.smtp.socketFactory.fallback", "false");

Session session = Session.getDefaultInstance(props,
new javax.mail.Authenticator() {

protected PasswordAuthentication getPasswordAuthentication() {
return  getPasswordAuthentication();
}
});



MimeMessage message1 =
new MimeMessage();
((Object) message1).setFrom(
new Inet4Address(from, null));
message1.addRecipient(
Message.RecipientType.TO,
new InetSocketAddress(recipients[0]));

message1.addRecipient(
Message.RecipientType.TO,
new Inet4Address(recipients[1]));

((emaildemo.MimeMessage) message1).setSubject(
"Hello JavaMail Attachment");

MimeBodyPart
 messageBodyPart =
new MimeBodyPart();

messageBodyPart.setText("Hi");

Multipart multipart = new MimeMultipart();
((Object) multipart).addBodyPart(messageBodyPart);


messageBodyPart = new MimeBodyPart();
DataSource source =
new FileDataSource(fileAttachment);
((Object) messageBodyPart).setDataHandler(
new DataHandler(source));
messageBodyPart.setFileName(fileAttachment);
multipart.addBodyPart(messageBodyPart);

// Put parts in message
((emaildemo.MimeMessage) message1).setContent(multipart);

// Send the message
Transport.send( message1 );
}

public static int getAddProvider() {
	return addProvider;
}

public static void setAddProvider(int addProvider) {
	GoogleTests.addProvider = addProvider;
}
} 