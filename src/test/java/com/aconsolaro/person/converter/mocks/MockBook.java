package com.aconsolaro.person.converter.mocks;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aconsolaro.person.data.model.Book;
import com.aconsolaro.person.data.vo.v1.BookVO;

public class MockBook {

	public Book mockEntity() {
		return mockEntity(0);
	}

	public BookVO mockVO() {
		return mockVO(0);
	}
	
	public List<Book> mockEntityList() {
		List<Book> people = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			people.add(mockEntity(i));
		}
		return people;
	}

	public List<BookVO> mockVOList() {
		List<BookVO> people = new ArrayList<>();
		for (int i = 0; i < 14; i++) {
			people.add(mockVO(i));
		}
		return people;
	}
	
	private Book mockEntity(Integer number) {
		Book book = new Book();
		book.setId(number.longValue());
		book.setAuthor("Author" + number);
		book.setLaunchDate(new Date());
		book.setPrice(BigDecimal.valueOf(number));
		book.setTitle("Title" + number);
		
		return book;
	}

	private BookVO mockVO(Integer number) {
		BookVO book = new BookVO();
		book.setId(number.longValue());
		book.setAuthor("Author" + number);
		book.setLaunchDate(new Date());
		book.setPrice(BigDecimal.valueOf(number));
		book.setTitle("Title" + number);
		
		return book;
	}
	
	
}
