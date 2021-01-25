package com.webapp.medSavvy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.medSavvy.entity.Medicine;
import com.webapp.medSavvy.repository.MedicineRepository;

@Service
public class MedicineService {
	@Autowired
	private MedicineRepository mrepo;
	
	
	//Add Med
	public Medicine addMedicine(Medicine medicine) {
		return mrepo.save(medicine);
	}
	
	// fetch all med
	public List<Medicine> fetchAllMedicine() {
		return mrepo.findAll();
	}
	
	//find by med Name
	public Medicine findByMedname(String temp_medname) {
		return mrepo.findByMedname(temp_medname);
	}
	
    //find med by id
	public  Optional<Medicine> findByID(Long id) {
		return mrepo.findById(id);
	}
	
	
	
	//delete med by id
	public String deleteByID(Long id) {
		String result;
		 try {
		mrepo.deleteById(id);
		result = "Succesfully Deleted";
		 }
		 catch (Exception e){
			 
			 result = "Incorrect Medicine ID . Please verify the Medicine ID";
		 }
		 
	return result;
	}
}
