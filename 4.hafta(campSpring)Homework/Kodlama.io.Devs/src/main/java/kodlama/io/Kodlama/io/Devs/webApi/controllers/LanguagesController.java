package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@RestController //annotation-bilgilendirme
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		
		this.languageService = languageService;
	}
	
	@GetMapping
	public List<Language> getall(){
		return languageService.getall();
		
	}
	@PostMapping
	public void add(@RequestBody Language language) throws Exception {
		languageService.addLanguage(language);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws Exception {
		languageService.deleteLanguage(id);
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable int id,@RequestBody Language language) throws Exception {
		languageService.updateLanguage(id, language);
	}
	
	@GetMapping("/{id}")
	public void getById(@PathVariable int id) throws Exception {
		languageService.getByid(id);
	}

}
