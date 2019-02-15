package com.gcp.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcp.app.rest.domain.response.ResponseHandlerBase;

@RestController
public class HandlerController {

	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public ResponseEntity<ResponseHandlerBase> getAllProducts() {

		return new ResponseEntity<ResponseHandlerBase>(new ResponseHandlerBase(), HttpStatus.OK);

	}

}
