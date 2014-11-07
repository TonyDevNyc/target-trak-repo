package com.target.trak.system.domain.matters;

import java.sql.Timestamp;

import com.target.trak.system.domain.ContactEntity;

public class MatterEntity {

	private Long id;
	private MatterTypeEntity matterType;
	private ContactEntity primaryContact;
	private String status;
	private Timestamp createDate;
	
	
}
