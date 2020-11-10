package com.test.fileupload.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.test.fileupload.vo.Book;

@Controller
public class FileUploadController {

	static List<Book> bookList = new ArrayList<Book>();
	@Resource(name = "uploadPath")
	String uploadPath;// "/resources"

	@RequestMapping(value = "/show/upload", method = RequestMethod.GET)
	public String move() {
		return "/fileuploads/upload";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(Book book, MultipartFile file, Model model, HttpServletRequest request) throws Exception {
		System.out.println("a");
		System.out.println("uploadPath= " + uploadPath);
		System.out.println("파일이름: " + file.getOriginalFilename());
		System.out.println("파일크기: " + file.getSize());

		System.out.println("컨텍트 타입: " + file.getContentType());// 파일확장자 출력 파일타입을 춫력 (png, jpeg)

		String savedName = file.getOriginalFilename();
		System.out.println("originalFileName: " + savedName);

		book.setBookImage(file);

		System.out.println("book: " + book.toString());

		// realpath (서버가 관리하는 실제경로를 얻어온다)
		// uploadPath: 어느경로에 저장이될지
		String resourcesPath = request.getSession().getServletContext().getRealPath(uploadPath); // "실제경로/resourses"
		System.out.println("request.getServletContext(): " + request.getServletContext());
		System.out.println("resourcesPath: " + resourcesPath);
		File target = new File(resourcesPath, savedName);// 경로를 통해서 실제 파일을 만든다 아직 내용은 비어있다
		System.out.println("target: " + target.toString());

		// 톰켓이 관리하는 실제 경로에 이미지 파일을 저장한다
		// 파일은 멀티파트폼으로 받아온 파일이다
		// 타겟은 위에서 만든 실제 업로드파일
		// 실제경로에 타겟이 복사된다
		FileCopyUtils.copy(file.getBytes(), target);// 실제데이터를 경로로 복사해준다

		bookList.add(book);
		model.addAttribute("fileName", savedName);
		model.addAttribute("book", book);
		
		int bookId = -1;
		for (int i = 0; i < bookList.size(); i++) {
			if (book.getTitle().equals(bookList.get(i).getTitle())) {
				bookId = i;
			}
		}
		
		model.addAttribute("bookId", bookId);
		

		return "fileuploads/result";
	}

	@GetMapping("/book/update/{bookId}")
	public String update(Model model, @PathVariable Integer bookId) {
		bookList.get(bookId);
		System.out.println("book: " + bookList.get(bookId).toString());
		model.addAttribute("beforeUpdateBook", bookList.get(bookId));
		model.addAttribute("bookId", bookId);
		return "fileuploads/update";
	}

	@PostMapping("/book/update/{bookId}")
	public String update(@PathVariable Integer bookId , Book book, MultipartFile file, HttpServletRequest request, Model model)  throws Exception  {
		System.out.println("uploadPath= " + uploadPath);
		String fileName = file.getOriginalFilename();
		System.out.println("파일이름: " + fileName);
		bookList.get(bookId).setBookImage(file);
		bookList.get(bookId).setContent(book.getContent());
		bookList.get(bookId).setMokcha(book.getMokcha());
		bookList.get(bookId).setTitle(book.getTitle());
		
		System.out.println("book= " + book.toString());
		System.out.println("book= " + bookList.get(bookId).toString());
		System.out.println("파일크기: " + file.getSize());
		System.out.println("컨텍트 타입: " + file.getContentType());

		String resourcesPath = request.getSession().getServletContext().getRealPath(uploadPath); // "실제경로/resourses"
		File target = new File(resourcesPath, fileName);
		System.out.println("target: " + target.toString());

		FileCopyUtils.copy(file.getBytes(), target);
		System.out.println("수정완료: " + bookList.get(bookId).toString());

		model.addAttribute("bookId", bookId);
		
		return "redirect:/fileuploads/result/" + bookId;
	}
	
	@GetMapping("/fileuploads/result/{bookId}")
	public String result(Model model, @PathVariable Integer bookId) {
		System.out.println("수정완료: " + bookList.get(bookId).toString());
		model.addAttribute("book", bookList.get(bookId));
		return "fileuploads/updated_result";
	}
	
}
