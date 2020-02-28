package com.aconsolaro.person.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aconsolaro.person.adapter.DozerAdapter;
import com.aconsolaro.person.data.model.Book;
import com.aconsolaro.person.data.vo.v1.BookVO;
import com.aconsolaro.person.exception.ResourceNotFoundException;
import com.aconsolaro.person.repository.BookRepository;

@Service
public class BookServices {

	@Autowired
	private BookRepository repository;
	
	public BookVO create(BookVO bookVO) {
		var entity = DozerAdapter.parseObject(bookVO, Book.class);
		var entitySave = repository.save(entity);
		return DozerAdapter.parseObject(entitySave, BookVO.class);
	}

	public BookVO update(BookVO bookVO) {
		var entity = repository.findById(bookVO.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this id!"));
		entity.setAuthor(bookVO.getAuthor());
		entity.setLaunchDate(bookVO.getLaunchDate());
		entity.setPrice(bookVO.getPrice());
		entity.setTitle(bookVO.getTitle());
		
		var save = repository.save(entity);
		return DozerAdapter.parseObject(save, BookVO.class);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public BookVO findById(Long id) {
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id!"));
		return DozerAdapter.parseObject(entity, BookVO.class);
	}

	public List<BookVO> findAll() {
		return DozerAdapter.parseListObjects(repository.findAll(), BookVO.class);
	}
}
