package com.ss.service;

import java.util.List;

import com.ss.bindings.ContactForm;

public interface IContactService {
	
	public String saveContact(ContactForm form);
	
	public List<ContactForm> viewContacts();
	
	public ContactForm editContact(Integer contactId);
	
	public List<ContactForm> deleteContact(Integer contactId);

}
