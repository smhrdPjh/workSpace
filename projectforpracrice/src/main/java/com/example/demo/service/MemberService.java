package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Member;
import com.example.demo.mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	MemberMapper memberMapper;
	
	public String checkId(Member id) {		
		if(memberMapper.checkId(id)==1) {
			return "이미 가입한 아이디가 있습니다.";
		}else {
			return "사용 가능한 아이디 입니다.";
		}				
	}
	
	

}
