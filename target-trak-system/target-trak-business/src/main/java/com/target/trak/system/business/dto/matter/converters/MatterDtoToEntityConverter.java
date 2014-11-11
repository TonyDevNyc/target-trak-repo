package com.target.trak.system.business.dto.matter.converters;

import org.springframework.core.convert.converter.Converter;

import com.target.trak.system.business.dto.matter.MatterDto;
import com.target.trak.system.business.util.DateUtils;
import com.target.trak.system.domain.ContactEntity;
import com.target.trak.system.domain.matters.MatterEntity;

public class MatterDtoToEntityConverter implements Converter<MatterDto, MatterEntity> {

	@Override
	public MatterEntity convert(MatterDto source) {
		MatterEntity entity = new MatterEntity();
		entity.setId(source.getId());

		ContactEntity primaryContact = new ContactEntity();
		primaryContact.setId(source.getPrimaryContact().getId());
		entity.setPrimaryContact(primaryContact);

		entity.setStatus(source.getStatus());
		entity.setCreateDate(DateUtils.convertCalendarToTimestamp(source.getCreateDate()));
		entity.setCompletionDate(DateUtils.convertCalendarToTimestamp(source.getCompletionDate()));
		entity.setCreatedBy(source.getCreatedBy());
		entity.setLastUpdatedBy(source.getLastUpdatedBy());
		entity.setLastUpdatedDate(DateUtils.convertCalendarToTimestamp(source.getLastUpdatedDate()));
		entity.setServiceLevelAgrementDate(DateUtils.convertCalendarToTimestamp(source.getServiceLevelAgrementDate()));
		return entity;
	}

}
