package com.test.fileupload.admin.adminaccount.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.fileupload.admin.adminaccount.entity.AdminEntity;
import com.test.fileupload.admin.adminaccount.persistence.AdminDAO;

@Service
public class AdminServiceImpl  implements AdminService{
	
	@Autowired
	private AdminDAO adminDao;

	@Override
	public AdminEntity selectOne(AdminEntity entity) {
		return adminDao.selectOne(entity);
	}
	
	

}
