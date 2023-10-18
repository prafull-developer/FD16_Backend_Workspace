package com.delta.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.delta.dto.AllpersonalDocs;
import com.delta.proxy.DocProxy;
import com.delta.service.CmService;

@Service
public class CmServiceImpl implements CmService {
	
	
	@Autowired
	private DocProxy docproxy;

	@Override
	public AllpersonalDocs getAllDocs() {
		
		
		
		
		
		return null;
	}
	
	
	
	
	

}
