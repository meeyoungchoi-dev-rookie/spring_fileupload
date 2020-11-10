package com.test.fileupload.admin.adminaccount.dto;

import com.test.fileupload.admin.adminaccount.entity.AdminEntity;

public class AdminDTO {
	private String adminId;
	private String adminPw;
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	
	
	public AdminDTO(String adminId, String adminPw) {
		super();
		this.adminId = adminId;
		this.adminPw = adminPw;
	}
	
	
	public AdminEntity toEntity() {
		return AdminEntity.builder().adminId(adminId).adminPw(adminPw).build();
	}
	
	
	@Override
	public String toString() {
		return "AdminDTO [adminId=" + adminId + ", adminPw=" + adminPw + "]";
	}
	
	
	
	

}
