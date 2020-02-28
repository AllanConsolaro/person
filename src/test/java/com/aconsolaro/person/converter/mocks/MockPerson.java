package com.aconsolaro.person.converter.mocks;

import java.util.ArrayList;
import java.util.List;

import com.aconsolaro.person.data.model.Person;
import com.aconsolaro.person.data.vo.v1.PersonVO;

public class MockPerson {

	public Person mockEntity() {
		return mockEntity(0);
	}

	public PersonVO mockVO() {
		return mockVO(0);
	}
	
	public List<Person> mockEntityList() {
		List<Person> people = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			people.add(mockEntity(i));
		}
		return people;
	}

	public List<PersonVO> mockVOList() {
		List<PersonVO> people = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			people.add(mockVO(i));
		}
		return people;
	}
	
	private Person mockEntity(Integer number) {
		Person person = new Person();
		person.setId(number.longValue());
		person.setFirstName("First Name Test" + number);
		person.setLastName("Last Name Test" + number);
		person.setAddress("Addres Test" + number);
		person.setGender(((number % 2) == 0) ? "Male" : "Female");
		
		return person;
	}

	private PersonVO mockVO(Integer number) {
		PersonVO person = new PersonVO();
		person.setId(number.longValue());
		person.setFirstName("First Name Test" + number);
		person.setLastName("Last Name Test" + number);
		person.setAddress("Addres Test" + number);
		person.setGender(((number % 2) == 0) ? "Male" : "Female");
		
		return person;
	}
	
	
}
