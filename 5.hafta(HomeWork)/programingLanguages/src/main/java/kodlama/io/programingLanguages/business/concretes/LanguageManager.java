package kodlama.io.programingLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programingLanguages.business.abstracts.LanguageService;
import kodlama.io.programingLanguages.business.request.CreateLanguageRequest;
import kodlama.io.programingLanguages.business.request.DeleteLanguageRequest;
import kodlama.io.programingLanguages.business.request.GetByIdLanguageRequest;
import kodlama.io.programingLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.programingLanguages.business.response.GetAllLanguageResponse;
import kodlama.io.programingLanguages.business.response.GetByIdLanguageResponse;
import kodlama.io.programingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.programingLanguages.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.programingLanguages.entities.Language;
import kodlama.io.programingLanguages.entities.Technology;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	private TechnologyRepository technologyRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository, TechnologyRepository technologyRepository) {
		this.languageRepository = languageRepository;
		this.technologyRepository = technologyRepository;
	}
	public List<GetAllLanguageResponse> getAll(){
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguageResponse> languageResponse = new ArrayList<>();
			for (Language language : languages) {
					GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
					responseItem.setId(language.getId());
					responseItem.setName(language.getName());
					languageResponse.add(responseItem);
			}
			return languageResponse;
	}
		
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		if(!isNameValid(createLanguageRequest.getName())) {
			this.languageRepository.save(language);
		}
		else {
			throw new Exception("İsim mevcuttur.");
		}
		
	}
	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
		Language language = new Language();
		language.setId(deleteLanguageRequest.getId());
		if(isIdExcist(deleteLanguageRequest.getId())) {
			this.languageRepository.delete(language);
		}else {
			throw new Exception("Id mevcut değildir");
		}
		
	}
	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception {
		Language language = new Language();
		language.setId(updateLanguageRequest.getId());
		language.setName(updateLanguageRequest.getName());
		if(isIdExcist(updateLanguageRequest.getId())) {
			this.languageRepository.save(language);
		}else {
			throw new Exception("Id mevcut değildir");
		}
		
		
	}
	
	public List<Language>getall(){
		return languageRepository.findAll();
	}
	
	private boolean isIdExcist(int id) {
		for (Language language : getall()) {
			if(language.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isNameValid(String name) throws Exception {
		if(name.isEmpty()) {
			throw new Exception("İsim boş olamaz");
		}
		for (Language language : getall()) {
			if(language.getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public GetByIdLanguageResponse getById(GetByIdLanguageRequest getByIdLanguageRequest) {
		GetByIdLanguageResponse getById = new GetByIdLanguageResponse();
		List<Language> languages = languageRepository.findAll();
		List<Technology> technologies = technologyRepository.findAll();
		for (Language language : languages) {
				for (Technology technology : technologies) {
					if(language.getId() == getByIdLanguageRequest.getId()) {
						getById.setName(language.getName());
						getById.setTechnologyName(technology.getName());
						getById.setTechnologyId(technology.getId());
				}
			}
		}
		return getById;
	}
}
