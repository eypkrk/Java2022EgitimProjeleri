package kodlama.io.programingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programingLanguages.business.request.CreateLanguageRequest;
import kodlama.io.programingLanguages.business.request.DeleteLanguageRequest;
import kodlama.io.programingLanguages.business.request.GetByIdLanguageRequest;
import kodlama.io.programingLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.programingLanguages.business.response.GetAllLanguageResponse;
import kodlama.io.programingLanguages.business.response.GetByIdLanguageResponse;

public interface LanguageService {
	List<GetAllLanguageResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest)throws Exception;
	void delete(DeleteLanguageRequest deleteLanguageRequest)throws Exception;
	void update(UpdateLanguageRequest updateLanguageRequest)throws Exception;
	GetByIdLanguageResponse getById(GetByIdLanguageRequest getByIdLanguageRequest);
}
