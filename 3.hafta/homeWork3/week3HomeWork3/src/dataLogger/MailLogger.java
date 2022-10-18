package dataLogger;

public class MailLogger implements Logger{

	@Override
	public void add(String data) {
		System.out.println("Mail loglandı : " +data);
		
	}

}
