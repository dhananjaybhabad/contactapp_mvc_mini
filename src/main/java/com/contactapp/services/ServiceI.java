package com.contactapp.services;

import java.util.List;

import com.contactapp.model.ContactInfo;
import com.contactapp.model.UserInfo;

public interface ServiceI {

	public boolean SaveData(ContactInfo contactinfo);

	public List<ContactInfo> viewContacts();

	public ContactInfo getContactByid(Integer id);

	public boolean deleteByidcontact(Integer contactid);

	public boolean saveUser(UserInfo userInfo);

}
