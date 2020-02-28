package com.aconsolaro.person.exception;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ResponseException implements Serializable {

	private static final long serialVersionUID = 5182042719888332501L;

	private Date timestamp;
	private String message;
	private String detail;
}
