package com.home.st1.writing;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WritingDAO {
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.home.st1.writing.WritingDAO.";
	
	public List<WritingDTO> getWritingList() throws Exception{
		return sqlSession.selectList(NAMESPACE + "getWritingList");
	}
	// detail update delete insert
	public WritingDTO getWritingDetail(WritingDTO writingDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE + "getWritingDetail", writingDTO);
	}
	
	public int setWritingUpdate(WritingDTO writingDTO) throws Exception{
		return sqlSession.update(NAMESPACE + "setWritingDelete", writingDTO);
	}
	
	public int setWritingDelete(WritingDTO writingDTO) throws Exception{
		return sqlSession.delete(NAMESPACE + "setWritingDelete", writingDTO);
	}
	
	public int setWritingInsert(WritingDTO writingDTO) throws Exception{
		return sqlSession.insert(NAMESPACE + "setWritingInsert", writingDTO);
	}
}
