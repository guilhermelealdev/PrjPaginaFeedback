package com.guilhermef.br.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.guilhermef.br.exceptions.BadRequestException;
import com.guilhermef.br.exceptionsDetails.BadRequestExceptionDetails;

@RestControllerAdvice
public class RestControllerHandler {

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<BadRequestExceptionDetails> handlerBadRequestException(BadRequestException badRequest) {
		return new ResponseEntity<>(
				BadRequestExceptionDetails.builder()
						.timestamp(LocalDateTime.now())
						.status(HttpStatus.BAD_REQUEST.value())
						.title("Bad Request Exception, check the documentation.")
						.details(badRequest.getMessage())
						.developerMessage(badRequest.getClass().getName())
						.build(),
				HttpStatus.BAD_REQUEST);
	}
}