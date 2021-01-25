package com.webapp.medSavvy.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.medSavvy.entity.Medicine;

import com.webapp.medSavvy.exception.UsernotFound;
import com.webapp.medSavvy.service.MedicineService;

@RestController
@RequestMapping("/admin-med")
@CrossOrigin
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
	
	
	@PostMapping("/edit-med")
	public Medicine editMedicine(@RequestBody Medicine medicine) throws Exception{
		Long temp_id = medicine.getID();
		Optional<Medicine> mobj= Mservice.findByID(temp_id);
		if (mobj != null){
			throw new Exception (temp_id + " medicine id does not exists");
		}
		
		return (Mservice.addMedicine(medicine));
		
	}
	
	
	
	
	
	//Get All Medicines
	@GetMapping("/all-med")
	@CrossOrigin
	public Iterable<Medicine> fetchAllMedicines() {
		return (Mservice.fetchAllMedicine());
	}
	
	//search medicine
	@GetMapping("/srch-med/{medname}")
	@CrossOrigin
	public Medicine srchMedicine(@PathVariable String medname) throws UsernotFound{
		Medicine mobj= Mservice.findByMedname(medname);
		if(mobj==null) {
			  throw new UsernotFound("No Medicine Found. Please enter the correct name");
			 }
		return (mobj);
		
	}
	
	// get the current medicine
	@GetMapping("/get-med/{id}")
	@CrossOrigin
	public Optional<Medicine> getMedById(@PathVariable Long id) throws UsernotFound{
		Optional<Medicine> mobj= Mservice.findByID(id);
		if(mobj==null) {
			  throw new UsernotFound("No Medicine Found.");
			 }
		return (mobj);
		
	}
	
	
	
	// delete the current medicine.
	@DeleteMapping("/delete/{id}")
	@CrossOrigin
	public String deleteMedicine(@PathVariable Long id ) throws UsernotFound{
		String mobj= Mservice.deleteByID(id);
		if(mobj==null) {
			  throw new UsernotFound("No Medicine Found.");
			 }
		return (mobj);
		
	}
	
		
	}



