package com.home.st1.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	//회원가입
	public int setMemeberAdd(MemberDTO memberDTO) throws Exception {
		int result = memberDAO.setMemberAdd(memberDTO);
		result = memberDAO.setMemeberRoleAdd(memberDTO);
		return result;
	}
		
	//로그인
	public MemberDTO getMemberLogin(MemberDTO memberDTO) throws Exception {
		MemberDTO result = memberDAO.getMemberLogin(memberDTO);
	
		//password check
		if(result != null && memberDTO.getPw().equals(result.getPw())) {
			memberDTO.setPw(null);
			return memberDTO;
		}else {
			return null;
		}
	
	}
	public MemberDTO getMemberPage(MemberDTO memberDTO) throws Exception{
		return memberDAO.getMemberLogin(memberDTO);
	}
	
	
	//회원정보페이지	
	public MemberDTO setMemberPage(MemberDTO memberDTO) throws Exception {
		return memberDAO.getMemberPage(memberDTO);
	}
		
	//정보수정
	public int setMemberUpdate(MemberDTO memberDTO) throws Exception {
		int result = memberDAO.setMemberUpdate(memberDTO);
		return result;
	}
	
	
	
}
