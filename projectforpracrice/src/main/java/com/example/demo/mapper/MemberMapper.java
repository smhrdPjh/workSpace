package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dao.Member;

@Mapper
public interface MemberMapper {
	
	@Select("select count(*) from members where memberid=#{memberId}") 
	public int checkId(Member memberId);
	
	@Insert("insert into members(mb_id, mb_pw, mb_nick, mb_email, mb_joindate) VALUES (#{mb_id}, #{mb_pw}, #{mb_nick}, #{mb_email}, now())")
	public int joinMember(Member info);
	
	@Select("select count(*) from members where membernick=#{memberncik}")
	public int checkNick(Member nick);

}
