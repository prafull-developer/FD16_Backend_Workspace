package com.delta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delta.dto.AllpersonalDocs;
import com.delta.service.CmService;
@RestController
@RequestMapping("/cm-service")
public class CmController {
	@Autowired
	private CmService cmService;
	
	
	public ResponseEntity<AllpersonalDocs> getAllDocs()
	
	{
		
		
		return ResponseEntity.status(HttpStatus.OK).body(cmService.getAllDocs());
		
		
		
		
		
	}
	
	
	

}
