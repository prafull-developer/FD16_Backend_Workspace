package com.delta.dto;

import javax.persistence.Lob;

import lombok.Data;

@Data

public class AllpersonalDocs {

	
	private int documentId;
	
	@Lob
	private byte[] addressProof;
	
	@Lob
	private byte[] panCard;
	@Lob
	private byte itr;
	
	@Lob
	private byte[] adharCard;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] bankCheque;
	@Lob		
	private byte[] salarySlips;
	

}
