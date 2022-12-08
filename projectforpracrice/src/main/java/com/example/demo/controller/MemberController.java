package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Member;

import com.example.demo.service.MemberService;
import com.google.gson.Gson;

@RestController // @Controller + @ResponseBody
public class MemberController {
	@Autowired
	MemberService memberService;

	// 회원가입
	@PostMapping(value = "/joinMember")
	public String join(@RequestBody Member info) {

		return memberService.joinMember(info);
	}

	// 아이디 중복확인
	@PostMapping(value = "/checkid")
	public String checkId(@RequestBody Member id) {

		return memberService.checkId(id);
	}

	// 닉네임 중복확인
	@GetMapping(value = "/checkNick")
	public String checkNick(@RequestParam(value = "nick", required = false) Member nick) {

		return memberService.checkNick(nick);

	}
	// 이메일 인증
	@PostMapping(value ="/emailCertification")
	public String emailCertification(@RequestBody Member email) throws Exception {
		
		
		Gson gson= new Gson();
		
		String stringEmail = gson.toJson(email, Member.class);
		String code =  memberService.emailCertifivation(stringEmail);
		
		return code;
	}

}
