package com.test.fileupload.dto;

public class MaincategoryDTO {
	private String mainCateName;

	public String getMainCateName() {
		return mainCateName;
	}

	public void setMainCateName(String mainCateName) {
		this.mainCateName = mainCateName;
	}

	public MaincategoryDTO(String mainCateName) {
		super();
		this.mainCateName = mainCateName;
	}
	
	
	

	@Override
	public String toString() {
		return "MaincategoryDTO [mainCateName=" + mainCateName + "]";
	}

}
