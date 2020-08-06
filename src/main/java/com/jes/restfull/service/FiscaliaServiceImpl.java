package com.jes.restfull.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.jes.restfull.commons.GenericServiceImpl;
import com.jes.restfull.model.Fiscalia;
import com.jes.restfull.repository.FiscaliaRepository;

@Service
public class FiscaliaServiceImpl extends GenericServiceImpl<Fiscalia, Long> implements FiscaliaService {

	@Autowired
	FiscaliaRepository fiscaliaRepository;

	@Override
	public CrudRepository<Fiscalia, Long> getRepository() {
		return fiscaliaRepository;
	}
}
