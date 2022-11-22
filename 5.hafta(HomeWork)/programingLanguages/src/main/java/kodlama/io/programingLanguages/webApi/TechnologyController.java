package kodlama.io.programingLanguages.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programingLanguages.business.abstracts.TechnologyService;
import kodlama.io.programingLanguages.business.request.CreateTechnologyRequest;
import kodlama.io.programingLanguages.business.request.DeleteTechnologyRequest;
import kodlama.io.programingLanguages.business.request.GetByIdTechnologyRequest;
import kodlama.io.programingLanguages.business.request.UpdateTechnologyRequest;
import kodlama.io.programingLanguages.business.response.GetAllTechnologyResponse;
import kodlama.io.programingLanguages.business.response.GetByIdTechnologyResponse;

@RestController
@RequestMapping("/technologies")
public class TechnologyController {
	private TechnologyService technologyService;
	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	@GetMapping("/getall")
	public List<GetAllTechnologyResponse> getAll(){
		return technologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest createTechnologyRequest)throws Exception {
		this.technologyService.add(createTechnologyRequest);
	}
	@DeleteMapping("/delete")
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest)throws Exception {
		this.technologyService.delete(deleteTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		this.technologyService.update(updateTechnologyRequest);
	}
	
	@GetMapping("{id}")
	public GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest) {
		return technologyService.getById(getByIdTechnologyRequest);
	}
}
