package dataLogger;

public class DatabaseLogger implements Logger{

	@Override
	public void add(String data) {
		System.out.println("Veritabanına loglandı : " + data);
		
	}

}
