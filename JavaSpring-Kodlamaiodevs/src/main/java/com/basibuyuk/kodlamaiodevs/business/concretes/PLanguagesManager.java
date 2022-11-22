package com.basibuyuk.kodlamaiodevs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basibuyuk.kodlamaiodevs.business.abstracts.PLService;
import com.basibuyuk.kodlamaiodevs.dataAccess.abstracts.PLanguageRepository;
import com.basibuyuk.kodlamaiodevs.entities.concretes.PLanguage;

@Service
public class PLanguagesManager implements PLService {

	PLanguageRepository pLanguageRepository;

	public PLanguagesManager(PLanguageRepository pLanguageRepository) {
		this.pLanguageRepository = pLanguageRepository;
	}
	

	
	@Override
	public void add(PLanguage language) {

		pLanguageRepository.add(language);
	}
	
	
	@Override
	public List<PLanguage> getAll() {

		return pLanguageRepository.getAll();
	}

	public List<PLanguage> getAll(boolean notString) {
		List<PLanguage> returnList = pLanguageRepository.getAll();
		if (notString)
			return getAll();
		else
			return returnList;
	}

	@Override
	public void delete(int id) {
		pLanguageRepository.delete(id);

	}

	@Override
	public PLanguage getById(int id) {

		return pLanguageRepository.getById(id);
	}



	@Override
	public void update(PLanguage language) {
		pLanguageRepository.update(language);

	}

}
