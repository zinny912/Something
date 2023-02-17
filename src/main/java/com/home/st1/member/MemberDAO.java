package com.home.st1.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.home.st1.member.MemberDAO.";
	
	//회원가입
	public int setMemberAdd(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setMemberAdd", memberDTO);
	}
	//권한설정
	public int setMemeberRoleAdd(MemberDTO memberDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setMemberRoleAdd", memberDTO);
	}
	
	//로그인
	public MemberDTO getMemberLogin(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getMemberLogin",memberDTO);
	}
	
	//개인정보페이지
	public MemberDTO getMemberPage(MemberDTO memberDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getMemberPage",memberDTO);
	}
	
	//정보수정
	public int setMemberUpdate(MemberDTO memberDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setMemberUpdate", memberDTO);
		
	}

}
