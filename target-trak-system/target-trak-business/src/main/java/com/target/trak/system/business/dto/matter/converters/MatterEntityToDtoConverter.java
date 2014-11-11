package com.target.trak.system.business.dto.matter.converters;

import org.springframework.core.convert.converter.Converter;

import com.target.trak.system.business.dto.common.CompanyDto;
import com.target.trak.system.business.dto.common.ContactDto;
import com.target.trak.system.business.dto.matter.MatterDto;
import com.target.trak.system.business.dto.matter.MatterTypeDto;
import com.target.trak.system.business.util.DateUtils;
import com.target.trak.system.domain.matters.MatterEntity;

public class MatterEntityToDtoConverter implements Converter<MatterEntity, MatterDto> {

	@Override
	public MatterDto convert(MatterEntity source) {
		MatterDto dto = new MatterDto();
		dto.setId(source.getId());
		dto.setStatus(source.getStatus());
		dto.setCreateDate(DateUtils.convertTimestampToCalendar(source.getCreateDate()));
		dto.setCompletionDate(DateUtils.convertTimestampToCalendar(source.getCompletionDate()));
		dto.setCreatedBy(source.getCreatedBy());
		dto.setLastUpdatedBy(source.getLastUpdatedBy());
		dto.setLastUpdatedDate(DateUtils.convertTimestampToCalendar(source.getLastUpdatedDate()));
		dto.setServiceLevelAgrementDate(DateUtils.convertTimestampToCalendar(source.getServiceLevelAgrementDate()));

		MatterTypeDto matterType = new MatterTypeDto();
		matterType.setId(source.getMatterType().getId());
		matterType.setMatterTypeDescription(source.getMatterType().getMatterTypeDescription());
		dto.setMatterType(matterType);

		ContactDto contact = new ContactDto();
		contact.setId(source.getPrimaryContact().getId());
		contact.setFirstName(source.getPrimaryContact().getFirstName());
		contact.setLastName(source.getPrimaryContact().getLastName());
		contact.setMiddleInitial(source.getPrimaryContact().getMiddleInitial());
		contact.setSuffix(source.getPrimaryContact().getSuffix());

		CompanyDto company = new CompanyDto();
		company.setId(source.getPrimaryContact().getCompany().getId());
		contact.setCompany(company);

		dto.setPrimaryContact(contact);

		return dto;
	}

}
