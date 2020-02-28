package com.aconsolaro.person.data.vo.v1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class BookVO extends RepresentationModel<BookVO> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String author;
	private Date launchDate;
	private BigDecimal price;
	private String title;
}
