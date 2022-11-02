package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstarcts.ILanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository //
public class InMemoryLanguageRepository implements ILanguageRepository{
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Phyton"));
	}

	
	@Override
	public List<Language> getall() {
		
		return languages;
	}

	@Override
	public void add(Language language) {
		
		languages.add(language);
	}

	@Override
	public void delete(int id) {
		languages.remove(getById(id));
		
	}

	@Override
	public void update(int id, Language language) {
		getById(id).setName(language.getName());
		
	}


	@Override
	public Language getById(int id) {
		// TODO Auto-generated method stub
		for (Language language : languages) {
			if(language.getId()== id) {
				return language;
			}
		}
		return null;
	}



}
