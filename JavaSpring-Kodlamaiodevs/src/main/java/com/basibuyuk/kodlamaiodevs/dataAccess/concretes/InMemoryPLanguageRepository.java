package com.basibuyuk.kodlamaiodevs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.basibuyuk.kodlamaiodevs.dataAccess.abstracts.PLanguageRepository;
import com.basibuyuk.kodlamaiodevs.entities.concretes.PLanguage;

@Repository
public class InMemoryPLanguageRepository implements PLanguageRepository {

	List<PLanguage> planguages;

	public InMemoryPLanguageRepository() {
		planguages = new ArrayList<PLanguage>();
		planguages.add(new PLanguage(1, "Python"));
		planguages.add(new PLanguage(2, "C#"));
		planguages.add(new PLanguage(3, "Java"));
	}

	@Override
	public List<PLanguage> getAll() {

		return planguages;
	}

	@Override
	public void delete(int id) {
		planguages.remove(getById(id));

	}


	@Override
	public void add(PLanguage language) {
		planguages.add(language);

	}

	@Override
	public void update(PLanguage language) {
		planguages.remove(getById(language.getId()));
		planguages.add(language);

	}

}
