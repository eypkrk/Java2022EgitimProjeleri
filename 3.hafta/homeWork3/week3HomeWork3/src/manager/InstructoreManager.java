package manager;

import dataAccess.IInstructore;
import dataLogger.Logger;
import entities.Instructore;

public class InstructoreManager {
	
	private IInstructore ıınstructore;
	private Logger[] loggers;
	
	public InstructoreManager(IInstructore ıınstructore, Logger[]loggers) {
		this.loggers = loggers;
		this.ıınstructore = ıınstructore;
	}
	
	public void add(Instructore Instructore) {
		System.out.println("Eğitmen eklendi");
		ıınstructore.add(Instructore);
		for (Logger logger : loggers) {
			logger.add(Instructore.getName());
		}
	}

}
