package com.ss.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.bindings.ContactForm;
import com.ss.service.IContactService;

@RestController
public class ContactRestController {
	
	@Autowired
	private IContactService service;
	
	@PostMapping("/save")
	public String save(@RequestBody ContactForm form) {
		return service.saveContact(form);
	}
	
	@GetMapping("/view")
	public List<ContactForm> view(){
		return service.viewContacts();
	}
	
	@PostMapping("/edit/{contactId}")
	public ContactForm edit(@PathVariable Integer contactId) {
		return service.editContact(contactId);
		}
	
	@DeleteMapping("/delete/{deleteId}")
	public List<ContactForm> delete(@PathVariable Integer contactId){
		return service.deleteContact(contactId);
	}
	
}
