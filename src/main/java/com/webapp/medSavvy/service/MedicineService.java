package com.webapp.medSavvy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.medSavvy.entity.Medicine;
import com.webapp.medSavvy.repository.MedicineRepository;

@Service
public class MedicineService {
	@Autowired
	private MedicineRepository mrepo;
	
	
	public Medicine addMedicine(Medicine medicine) {
		return mrepo.save(medicine);
	}
	
	public List<Medicine> fetchAllMedicine() {
		return mrepo.findAll();
	}
	
	public Medicine findByMedname(String temp_medname) {
		return mrepo.findByMedname(temp_medname);
	}

}
