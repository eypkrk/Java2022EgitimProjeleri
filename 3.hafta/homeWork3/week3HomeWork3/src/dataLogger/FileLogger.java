package dataLogger;

public class FileLogger implements Logger{

	@Override
	public void add(String data) {
		System.out.println("Dosya loglandı : " + data);
		
	}

}
