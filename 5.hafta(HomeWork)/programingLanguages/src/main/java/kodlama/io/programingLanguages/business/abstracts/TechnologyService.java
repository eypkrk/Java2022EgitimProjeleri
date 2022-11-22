package kodlama.io.programingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programingLanguages.business.request.CreateTechnologyRequest;
import kodlama.io.programingLanguages.business.request.DeleteTechnologyRequest;
import kodlama.io.programingLanguages.business.request.GetByIdTechnologyRequest;
import kodlama.io.programingLanguages.business.request.UpdateTechnologyRequest;
import kodlama.io.programingLanguages.business.response.GetAllTechnologyResponse;
import kodlama.io.programingLanguages.business.response.GetByIdTechnologyResponse;

public interface TechnologyService {
	List<GetAllTechnologyResponse> getAll();
	void add(CreateTechnologyRequest createTechnologyRequest)throws Exception;
	void delete(DeleteTechnologyRequest deleteTechnologyRequest)throws Exception;
	void update(UpdateTechnologyRequest updateTechnologyRequest)throws Exception;
	GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest);
}
