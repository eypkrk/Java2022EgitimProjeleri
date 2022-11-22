package kodlama.io.programingLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.programingLanguages.entities.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Integer>{

}
