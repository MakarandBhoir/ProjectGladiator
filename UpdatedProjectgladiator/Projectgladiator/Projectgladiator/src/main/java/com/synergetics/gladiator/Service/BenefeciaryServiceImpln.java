package com.synergetics.gladiator.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergetics.gladiator.Entity.Benefeciary;
import com.synergetics.gladiator.Repository.BenefeciaryRepository;
@Service
public class BenefeciaryServiceImpln implements BenefeciaryService{

	@Autowired
	private BenefeciaryRepository beneficiaryrepository;
	
	public Benefeciary createBeneficiary(Benefeciary beneficiary)
	{
		return  beneficiaryrepository.save(beneficiary);
		
	}
}
