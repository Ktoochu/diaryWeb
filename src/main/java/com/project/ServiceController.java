package com.project;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServiceController {

	@Autowired
	private LoginService loginSv;
	
	@Autowired
	private MemberRegisterService regSvc;
	
	@Autowired
	private DiaryMenuService diaryMeSvc;

	// 메인 화면 (로그인/회원가입 창)
	@RequestMapping( {"/", "/loginMain"} ) public String main() {   return "loginMain";   }
	
	// 로그인 확인
	@RequestMapping("/loginCheck")
	public ModelAndView diaryMain(ModelAndView mav,
			@RequestParam(value = "ID", required = false) String id,
			@RequestParam(value = "PWD", required = false) String pwd) {

		mav.addObject("name", loginSv.login(id, pwd));		
		diaryMeSvc.setID(loginSv.getId());
		mav.setViewName("loginCheck");
		return mav;
	}
	
	// 로그아웃
	@RequestMapping("/logout")
	public String diaryMain() {
		return "logout";
	}
	
	// 다이어리 메인 메뉴
	@GetMapping("/diaryMain")
	public String diaryMain(Model model) {
		List<Diary> diarys = diaryMeSvc.showAllMenu();
		model.addAttribute("diarys", diarys);
		return "diaryMain";
	}
	
	// 다이어리 검색
	@PostMapping("/diarySearch")
	public String diarySearch(Model model, @RequestParam(value = "keywd", required = false) String keywd) {
		try {
		List<Diary> diarys = diaryMeSvc.searchMenu(keywd);
		model.addAttribute("diarys", diarys);
		return "diarySearch";
		} catch (Exception ex) { return "diaryMain"; }
	}
	
	// 다이어리 보기
	@GetMapping("/diaryShow")
	public String diaryShow(Model model, @RequestParam(value = "id", required = false) int key) {
		try {
			Diary diarys = diaryMeSvc.showDiary(key);
			model.addAttribute("diarys", diarys);
			return "diaryShow";
		} catch (Exception ex) { return "diaryMain"; }
	}

	// 다이어리 수정 양식
	@PostMapping("/diaryUpdateForm")
	public String diaryUpdateForm(Model model, int number, DiaryRequest diaryReq) {
		try {
			// 자꾸 int형인 다이어리 번호를 못 받아오길래 따로 가져왔다.
			diaryReq.setNumber(number);
			model.addAttribute("diaryReq", diaryReq);
			return "diaryUpdateForm";
		} catch (Exception ex) { return "diaryMain"; }
	}

	// 다이어리 수정
	@PostMapping("/diaryUpdate")
	public String diaryUpdate(Model model, int number, DiaryRequest diaryReq) {
		try {
			// 자꾸 int형인 다이어리 번호를 못 받아오길래 따로 가져왔다.
			diaryReq.setNumber(number);
			diaryMeSvc.changeMenu(diaryReq.getNumber(), diaryReq.getTitle(), diaryReq.getContent());
			model.addAttribute("diaryReq", diaryReq);
			return "diaryUpdate";
		} catch (Exception ex) { return "diaryMain"; }
	}
	
	// 다이어리 쓰기 양식
	@PostMapping("/diaryWriteForm")
	public String diaryWriteForm(Model model) {
		try {
			return "diaryWriteForm";
		} catch (Exception ex) { return "diaryMain"; }
	}
	
	// 다이어리 쓰기
	@PostMapping("/diaryWrite")
	@Transactional
	public String diaryWrite(Model model, DiaryRequest diaryReq, MultipartHttpServletRequest fileReq) {
		try {

			List<MultipartFile> fileList = fileReq.getFiles("mediaFile");
			
			String filePath = "D:\\springworks\\finalProject\\fileStorage\\";	// 업로드 파일이 저장될 경로
			String saveName = "";
			
			// 파일 전송
			for (MultipartFile mf : fileList) {

				String fileName = mf.getOriginalFilename();		// 파일 이름
				saveName = saveName+","+fileName;				// 저장할 파일 이름
				
				try {
					mf.transferTo(new File(filePath + fileName));
				} catch(Exception e) {
				    System.out.println("업로드 오류");
				}
	        }

			// 다이어리 작성
			diaryMeSvc.writeMenu(diaryReq.getTitle(), diaryReq.getContent(), saveName);
			
			return "diaryWrite";
		} catch (Exception ex) { return "diaryMain"; }
	}
	
	// 다이어리 삭제
	@PostMapping("/diaryDelete")
	public String diaryDelete(Model model, int number) {
		try {
			diaryMeSvc.deleteMenu(number);
			return "diaryDelete";
		} catch (Exception ex) { return "diaryMain"; }
	}
	
	// 회원가입 양식
	@RequestMapping("/register") 
	public String registerReq(Model model) {
//		model.addAttribute("registerRequest", new RegisterRequest()); 
		return "register"; 
	}

	// 회원 등록
	@PostMapping("/registerSv")
	public String register(Model model, RegisterRequest regReq) {
		try {
			// 아무것도 입력 안해도 넘어가는 오류가 있음.
			regSvc.regist(regReq);
			return "registerSv";
		} catch (Exception ex) { return "loginMain"; }
	}
}
