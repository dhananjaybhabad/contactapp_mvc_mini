package com.contactapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactapp.model.ContactInfo;

@Repository
public interface ContactRepository extends JpaRepository<ContactInfo, Integer>{

}
