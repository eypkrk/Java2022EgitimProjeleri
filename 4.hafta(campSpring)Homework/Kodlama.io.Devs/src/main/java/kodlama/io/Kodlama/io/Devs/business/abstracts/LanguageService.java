package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getall();
	void addLanguage(Language language)throws Exception;
	void deleteLanguage(int id)throws Exception;
	void updateLanguage(int id,Language language) throws Exception;
	Language getByid(int id) throws Exception;
}
