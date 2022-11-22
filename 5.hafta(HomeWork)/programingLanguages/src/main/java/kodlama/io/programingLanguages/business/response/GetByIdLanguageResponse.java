package kodlama.io.programingLanguages.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdLanguageResponse {
	private String name;
	private String technologyName;
	private int technologyId;
}
