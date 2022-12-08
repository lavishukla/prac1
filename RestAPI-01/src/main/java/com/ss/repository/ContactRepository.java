package com.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ss.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
