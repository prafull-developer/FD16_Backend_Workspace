package com.cjc.model;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class DocumentVerification {
	
	
	private String status;
	
	
	

}
