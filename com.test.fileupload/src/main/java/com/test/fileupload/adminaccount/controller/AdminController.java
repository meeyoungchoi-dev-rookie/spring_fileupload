package com.test.fileupload.adminaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.fileupload.admin.adminaccount.dto.AdminDTO;
import com.test.fileupload.admin.adminaccount.entity.AdminEntity;
import com.test.fileupload.admin.adminaccount.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public String login() {
		return "admins/login";
	}
	
	@RequestMapping(value="/admin/login", method=RequestMethod.POST)
	public String loginCheck(AdminDTO adminDTO) {
		System.out.println("adminDTO: " + adminDTO.toString());
		
		System.out.println(adminDTO.toEntity().toString());
		
		AdminEntity entity = adminDTO.toEntity();
		
		AdminEntity admin = adminService.selectOne(entity);
		
		
		System.out.println("admin: " + admin.toString());
		
		
		
		
		return "";
	}
	
}
