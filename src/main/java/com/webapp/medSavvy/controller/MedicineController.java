package com.webapp.medSavvy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.medSavvy.entity.Medicine;
import com.webapp.medSavvy.service.MedicineService;

@RestController
@RequestMapping("/admin-med")

public class MedicineController {
	@Autowired
	private MedicineService Mservice;
    /* Add new medicine to inventory. Table name medicine. Medicine already exists then use the update functionality Only Admin can add medicines*/
	
	@PostMapping("/add-new-med")
	public Medicine addMedicine(@RequestBody Medicine medicine) throws Exception{
		String temp_medname = medicine.getMedname();
		Medicine mobj= Mservice.findByMedname(temp_medname);
		if (mobj != null){
			throw new Exception (temp_medname  + " medicine already exists");
		}
		
		return (Mservice.addMedicine(medicine));
	}
	
	//Get All Medicines
	@GetMapping("/all-med")
	public List<Medicine> fetchAllMedicines() {
		return (Mservice.fetchAllMedicine());
	}
	
	// write method for search medicine
}
