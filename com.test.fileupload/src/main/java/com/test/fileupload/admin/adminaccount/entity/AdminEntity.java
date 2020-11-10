package com.test.fileupload.admin.adminaccount.entity;

import lombok.Builder;

public class AdminEntity {
	
	private int adminSeq;
	private String adminId;
	private String adminPw;
	
	public int getAdminSeq() {
		return adminSeq;
	}
	public void setAdminSeq(int adminSeq) {
		this.adminSeq = adminSeq;
	}
	
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
	
	
	
	public AdminEntity() {
		super();
	}
	@Builder
	public AdminEntity(int adminSeq, String adminId, String adminPw) {
		super();
		this.adminSeq = adminSeq;
		this.adminId = adminId;
		this.adminPw = adminPw;
	}
	@Override
	public String toString() {
		return "AdminEntity [adminSeq=" + adminSeq + ", adminId=" + adminId + ", adminPw=" + adminPw + "]";
	}
	
	
	

	
	
	
	
	

}
