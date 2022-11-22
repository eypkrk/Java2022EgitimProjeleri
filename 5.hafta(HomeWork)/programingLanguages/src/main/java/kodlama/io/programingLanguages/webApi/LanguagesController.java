package kodlama.io.programingLanguages.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programingLanguages.business.abstracts.LanguageService;
import kodlama.io.programingLanguages.business.request.CreateLanguageRequest;
import kodlama.io.programingLanguages.business.request.DeleteLanguageRequest;
import kodlama.io.programingLanguages.business.request.GetByIdLanguageRequest;
import kodlama.io.programingLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.programingLanguages.business.response.GetAllLanguageResponse;
import kodlama.io.programingLanguages.business.response.GetByIdLanguageResponse;

@RestController
@RequestMapping("/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService){
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		this.languageService.add(createLanguageRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteLanguageRequest deleteLanguageRequest) throws Exception {
		this.languageService.delete(deleteLanguageRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateLanguageRequest updateLanguageRequest) throws Exception{
		this.languageService.update(updateLanguageRequest);
	}
	@GetMapping("{id}")
	public GetByIdLanguageResponse getyId(GetByIdLanguageRequest getByIdLanguageRequest) {
		return languageService.getById(getByIdLanguageRequest);
	}

}
