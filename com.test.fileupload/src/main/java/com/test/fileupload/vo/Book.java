package com.test.fileupload.vo;

import org.springframework.web.multipart.MultipartFile;

public class Book {
	private String title;
	private String content;
	private String mokcha;
	private MultipartFile bookImage;

	public MultipartFile getBookImage() {
		return bookImage;
	}
	public void setBookImage(MultipartFile bookImage) {
		this.bookImage = bookImage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMokcha() {
		return mokcha;
	}
	public void setMokcha(String mokcha) {
		this.mokcha = mokcha;
	}
	public Book( String title, String content, String mokcha) {
		super();
		this.title = title;
		this.content = content;
		this.mokcha = mokcha;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", content=" + content + ", mokcha=" + mokcha + ", bookImage=" + bookImage
				+ "]";
	}

	
	
	
	
	
	
	
	
}
