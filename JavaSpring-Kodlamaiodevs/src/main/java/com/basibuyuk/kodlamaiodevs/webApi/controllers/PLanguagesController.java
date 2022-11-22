package com.basibuyuk.kodlamaiodevs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basibuyuk.kodlamaiodevs.business.abstracts.PLService;
import com.basibuyuk.kodlamaiodevs.entities.concretes.PLanguage;



@RestController
@RequestMapping("/api/planguages")
public class PLanguagesController {

	private PLService plService;

	@Autowired
	public PLanguagesController(PLService plService) {
		this.plService = plService;
	}

	@GetMapping("/getall")
	public List<PLanguage> getAll() {
		return plService.getAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") int id) {
		plService.delete(id);
	}

	@GetMapping("/get/{id}")
	public PLanguage getById(@PathVariable(name = "id") int id) {
		return plService.getById(id);
	}

	@PostMapping("/add")

	public void add(@RequestBody PLanguage pLanguage) {
		plService.add(pLanguage);
	}

	@PutMapping("/update")
	public void update(@RequestBody PLanguage language) {
		plService.update(language);
	}
}
