package com.basibuyuk.kodlamaiodevs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.basibuyuk.kodlamaiodevs.entities.concretes.PLanguage;


public interface PLanguageRepository {

	List<PLanguage> getAll();

	void delete(int id);

	PLanguage getById(int id);

	void update(PLanguage language);

	void add(PLanguage language);
}
