package com.basibuyuk.kodlamaiodevs.business.abstracts;

import java.util.List;

import com.basibuyuk.kodlamaiodevs.entities.concretes.PLanguage;

public interface PLService {

	void delete(int id);

	void add(PLanguage language);

	void update(PLanguage language);

	List<PLanguage> getAll();

	PLanguage getById(int id);

}
