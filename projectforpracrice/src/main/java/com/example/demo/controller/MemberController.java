package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Member;
import com.example.demo.service.MemberService;

@RestController // @Controller + @ResponseBody
public class MemberController {	
	@Autowired
	MemberService memberService;
	
	
	
	//아이디 중복확인
	@RequestMapping(value = "/checkid", method = RequestMethod.POST, produces = "application/json; charset=utf8")
	public String checkId(@RequestBody Member id) {				
		
				
		
		return memberService.checkId(id);
	}
	
	
	
	
}
