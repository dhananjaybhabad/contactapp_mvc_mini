package com.contactapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contactapp.model.ContactInfo;
import com.contactapp.model.UserInfo;

@Service
public class ServiceImpl implements ServiceI {

	@Override
	public boolean SaveData(ContactInfo contactinfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ContactInfo> viewContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactInfo getContactByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteByidcontact(Integer contactid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return false;
	}

}
