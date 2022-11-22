package kodlama.io.programingLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programingLanguages.business.abstracts.TechnologyService;
import kodlama.io.programingLanguages.business.request.CreateTechnologyRequest;
import kodlama.io.programingLanguages.business.request.DeleteTechnologyRequest;
import kodlama.io.programingLanguages.business.request.GetByIdTechnologyRequest;
import kodlama.io.programingLanguages.business.request.UpdateTechnologyRequest;
import kodlama.io.programingLanguages.business.response.GetAllTechnologyResponse;
import kodlama.io.programingLanguages.business.response.GetByIdTechnologyResponse;
import kodlama.io.programingLanguages.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.programingLanguages.entities.Technology;

@Service
public class TechnologyManager implements TechnologyService{
	private TechnologyRepository technologyRepository;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository) {
		this.technologyRepository = technologyRepository;
	}

	public List<GetAllTechnologyResponse> getAll(){
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> technologyResponses = new ArrayList<>();
		
		for (Technology technology : technologies) {
			GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());	
			technologyResponses.add(responseItem);
		}
		return technologyResponses;
		
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		Technology technology = new Technology();
		technology.setName(createTechnologyRequest.getName());
		technology.setId(createTechnologyRequest.getLanguageId());
		if(isNameExcist(createTechnologyRequest.getName())) {
			throw new Exception("Bu isim mevcuttur");
		}
		else {
			this.technologyRepository.save(technology);
		}
		
	}
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		Technology technology = new Technology();
		technology.setId(deleteTechnologyRequest.getId());
		if(isIdExcist(deleteTechnologyRequest.getId())) {
			this.technologyRepository.delete(technology);
		}
		else {
			throw new Exception("Silinecek id mevcut değildir");
		}
		
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		Technology technology = new Technology();
		technology.setId(updateTechnologyRequest.getId());
		technology.setName(updateTechnologyRequest.getName());
		if(isIdExcist(updateTechnologyRequest.getId())) {
			this.technologyRepository.save(technology);
		}
		else {
			throw new Exception("Bu id mevcut değildir");
		}
	}
	
	public List<Technology> getall() {
		//iş-kuralları
		return technologyRepository.findAll();
	}
	
	private boolean isIdExcist(int id) {
		for (Technology technology : getall()) {
			if(technology.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isNameExcist(String name) throws Exception {
		if(name.isEmpty()) {
			throw new Exception("İsim boş olamaz");
		}
		for(Technology technology : getall()) {
			if(technology.getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest) {
		GetByIdTechnologyResponse responseItem = new GetByIdTechnologyResponse();
		List<Technology> technologies = technologyRepository.findAll();
		for (Technology technology : technologies) {
			if(technology.getId() == getByIdTechnologyRequest.getId()) {
				responseItem.setName(technology.getName());
			}
		}
		return responseItem;
	}



}
