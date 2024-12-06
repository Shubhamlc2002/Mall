package com.slc.Smart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.slc.Smart.Entity.Mall;
import com.slc.Smart.Entity.Staff;
import com.slc.Smart.Entity.address;
import com.slc.Smart.Entity.coustomer;
import com.slc.Smart.Repository.AdressRepository;
import com.slc.Smart.Repository.CoustomerRepository;
import com.slc.Smart.Repository.StaffRepository;
import com.slc.Smart.Repository.categoryRepository;
import com.slc.Smart.Repository.mallRepository;
import com.slc.Smart.Repository.productRepository;

@RestController
@RequestMapping("mall")
public class mallController {
	@Autowired
	mallRepository repo;
	@Autowired
	categoryRepository caterepo;
	@Autowired
	AdressRepository addrepo;
	@Autowired
	CoustomerRepository coustomrepo;
	@Autowired
	productRepository productrepo;
	@Autowired
	StaffRepository staffrepo;
	
	
	
	@GetMapping
	@ResponseStatus(code=HttpStatus.ACCEPTED)
    public List<Mall>getAlldata(){
    	return repo.findAll();
    	
    }
	@PostMapping
	public ResponseEntity<?> adddata(@RequestBody Mall mall){
		Mall adddata=repo.save(mall);
		return ResponseEntity.status(HttpStatus.CREATED).body(adddata);
		
	}
	@GetMapping("{id}")
	public Mall getByID(@PathVariable long id) {
		Mall mall=repo.findById(id).get();
		
		return mall;
		
		
		
	}@DeleteMapping("{id}")
	public ResponseEntity<?> DeleteBYID(@PathVariable long id){
		Mall m=this.getByID(id);
		repo.delete(m);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deta Deleted Sucessfully");
	}
//	@PutMapping("{id}")
//	public String UpdateData(@PathVariable long id,@RequestBody Mall mall){
//		
//		System.out.println();
//		
//		Mall product=this.getByID(id);
//		product.setName(mall.getName());
//		
//		
//	
//		List<Mall> Updatedata=repo.findAll();
//		List<Mall> Data= new ArrayList<>();
//		for(Mall m : Updatedata) {
//			if(m.getId()==id) {
//				Data.add(m);
//			}//
//		}
//		
//		
//		
//			
//			addrepo.save(mall.getAdress());
//			
//for (coustomer custo : mall.getCoustomer()) {
//	
//	coustomrepo.save(custo);
//	
//}	
//
//  for(com.slc.Smart.Entity.product p: mall.getProduct()) {
//	  productrepo.save(p);
//	
//     }
//  
//  for (Staff staff : mall.getStaff()) {
//	  staffrepo.save(staff);
//	
//}
// 
//  
//  for(Mall m:Data) {
////		m.setName(mall.getName());
////		m.setAdress(mall.getAdress());
////		m.setCoustomer(mall.getCoustomer());
////		m.setProduct(mall.getProduct());
////		m.setStaff(mall.getStaff());
//
//
//			repo.save(m);
//		}
//  
//  
//		return "data Updated sucessfully";
//		
//		
//		
//		
//	}
	@PutMapping("{id}")
	public String UpdateData(@PathVariable long id,@RequestBody Mall mall) {
		
		return null;
		
	}
	
}
