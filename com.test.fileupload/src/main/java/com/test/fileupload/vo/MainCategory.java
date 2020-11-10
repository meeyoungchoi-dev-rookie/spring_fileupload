package com.test.fileupload.vo;

public class MainCategory {
	
	private static int mainCateId = 0;
	private String mainCateName;



	public int getMainCateId() {
		return mainCateId;
	}

	public void setMainCateId(int mainCateId) {
		this.mainCateId += 1;		
	}

	public String getMainCateName() {
		return mainCateName;
	}

	public void setMainCateName(String mainCateName) {
		this.mainCateName = mainCateName;
	}

	
	
	public MainCategory(String mainCateName) {
		super();
		this.mainCateName = mainCateName;
	}

	@Override
	public String toString() {
		return "MainCategory [mainCateId=" + mainCateId + ", mainCateName=" + mainCateName + "]";
	}

}
