package com.target.trak.system.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.target.trak.system.business.MatterService;
import com.target.trak.system.business.dto.matter.MatterDto;
import com.target.trak.system.business.dto.matter.MatterRequest;
import com.target.trak.system.business.dto.matter.MatterResponse;
import com.target.trak.system.domain.matters.MatterEntity;
import com.target.trak.system.persistence.MatterDao;

@Transactional(propagation=Propagation.REQUIRED)
@Service("matterService")
public class MatterServiceImpl implements MatterService {

	@Autowired
	private MatterDao matterDao;
	
	@Autowired
	private ConversionService conversionService;
	
	@Override
	public MatterResponse createMatter(final MatterRequest request) {
		MatterResponse response = new MatterResponse();
		final MatterDto dto = request.getMatter();
		MatterEntity entity = matterDao.insertMatter(conversionService.convert(dto, MatterEntity.class));
		dto.setId(entity.getId());
		response.setMatter(dto);
		response.setSuccess(true);
		return response;
	}

	@Override
	public MatterResponse getMatterById(final MatterRequest request) {
		MatterResponse response = new MatterResponse();
		MatterEntity entity = matterDao.selectMatterById(conversionService.convert(request.getMatter(), MatterEntity.class));
		MatterDto dto = conversionService.convert(entity, MatterDto.class); 
		response.setMatter(dto);
		response.setSuccess(true);
		return response;
	}

	@Override
	public MatterResponse getAllActiveMatters(final MatterRequest request) {
		
		return null;
	}

	@Override
	public MatterResponse updateMatter(final MatterRequest request) {
		
		return null;
	}

	@Override
	public MatterResponse inactivateMatter(final MatterRequest request) {
		
		return null;
	}

	@Override
	public MatterResponse getInactiveMatters(final MatterRequest request) {
		
		return null;
	}

	@Override
	public MatterResponse getNumberOfActiveMatters(final MatterRequest request) {
		
		return null;
	}

}
