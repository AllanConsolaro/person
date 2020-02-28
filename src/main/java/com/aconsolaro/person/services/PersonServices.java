package com.aconsolaro.person.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aconsolaro.person.adapter.DozerAdapter;
import com.aconsolaro.person.data.model.Person;
import com.aconsolaro.person.data.vo.v1.PersonVO;
import com.aconsolaro.person.exception.ResourceNotFoundException;
import com.aconsolaro.person.repository.PersonRepository;

@Service
public class PersonServices {

	@Autowired
	private PersonRepository repository;
	
	public PersonVO create(PersonVO person) {
		var entity = DozerAdapter.parseObject(person, Person.class);
		var entitySave = repository.save(entity);
		return DozerAdapter.parseObject(entitySave, PersonVO.class);
	}

	public PersonVO update(PersonVO person) {
		var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this id!"));
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		var save = repository.save(entity);
		return DozerAdapter.parseObject(save, PersonVO.class);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public PersonVO findById(Long id) {
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id!"));
		return DozerAdapter.parseObject(entity, PersonVO.class);
	}

	public List<PersonVO> findAll() {
		return DozerAdapter.parseListObjects(repository.findAll(), PersonVO.class);
	}
}
