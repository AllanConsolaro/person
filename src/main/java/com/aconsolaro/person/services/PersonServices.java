package com.aconsolaro.person.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.aconsolaro.person.domain.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		person.setId(counter.incrementAndGet());
		return person;
	}

	public Person update(Person person) {
		return person;
	}

	public void delete(String id) {
		System.out.println(id);
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Allan");
		person.setLastName("Consolaro");
		person.setAddress("Rua das couves, 776");
		person.setGender("Male");
		
		return person;
	}

	public List<Person> findAll() {
		List<Person> lista = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = new Person();
			person.setId(counter.incrementAndGet());
			person.setFirstName("Allan " + i);
			person.setLastName("Consolaro " + i);
			person.setAddress("Rua das couves, 776 " + i);
			person.setGender("Male");
			
			lista.add(person);
		}
		return lista;
	}
}
