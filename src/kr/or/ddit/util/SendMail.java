package kr.or.ddit.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	private static SendMail instance = new SendMail();
	public static SendMail getInstance() {
		return instance;
	}
	
	private Random rand;
	private Map<String,String> map;
	
	static final String FROM = "yyj161091@gmail.com";
    static final String FROMNAME = "Abocado 서비스";
    static final String SMTP_USERNAME = "yyj161091@gmail.com";
    static final String SMTP_PASSWORD = "Yyj14161091!";
    static final String HOST = "smtp.gmail.com";
    static final int PORT = 465;
    
    private SendMail() {
    	rand = new Random();
    	map = new HashMap<String,String>();
    }
    
    public void SendCertification(String mail) {
    	String certification = MakeCertification();
    	String BODY = String.join(
    	        System.getProperty("line.separator"),
    	        "<h1>avocadoTV에 오신걸 환영합니다.</h1>",
    	        "<p>인증번호는",
    	        certification,
    	        " 입니다.</p>"
    	);
    	map.put(mail,certification);
    	Properties props = System.getProperties();
    	props.put("mail.smtp.host", "smtp.gmail.com");
    	props.put("mail.smtp.port", PORT); 
    	props.put("mail.smtp.auth", "true");
    	props.put("mail.smtp.ssl.enable", "true");
    	props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    	Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication() {
                 return new PasswordAuthentication(SMTP_USERNAME, SMTP_PASSWORD);
             }
        });
    	MimeMessage msg = new MimeMessage(session);
        try {        	
        	msg.setFrom(new InternetAddress(FROM, FROMNAME));
        	msg.setRecipient(Message.RecipientType.TO, new InternetAddress(mail));
        	msg.setSubject("인증 번호 발급");
        	msg.setContent(BODY, "text/html;charset=euc-kr");
        	Transport transport = session.getTransport();
        	transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
        	transport.sendMessage(msg, msg.getAllRecipients());
        	transport.close();
        }catch(Exception e) {
        	e.printStackTrace();        	
        }
    }
    
    public String getFromMap(String mail) {
    	return map.get(mail);
    }
    
    public String MakeCertification() {
    	char[] numbers = new char[] {'1','2','3','4','5','6','7','8','9','0'};
    	String certification="";
    	for(int i=0;i<6;i++) {
    		int select = rand.nextInt(numbers.length);
    		certification += numbers[select];
    	}
    	return certification;
    }
}
