package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dao.Member;

@Mapper
public interface MemberMapper {
	
	@Select("select count(*) from member where memberid=#{memberId}") 
	public int checkId(Member memberId);
	

}
