package com.home.st1.writing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WritingService {
	
	@Autowired
	private WritingDAO writingDAO;

	public List<WritingDTO> getWritingList() throws Exception{
		return writingDAO.getWritingList();
	}
	
	public WritingDTO getWritingDetail(WritingDTO writingDTO) throws Exception{
		return writingDAO.getWritingDetail(writingDTO);
	}
	
	public int setWritingUpdate(WritingDTO writingDTO) throws Exception{
		return writingDAO.setWritingUpdate(writingDTO);
	}
	
	public int setWritingDelete(WritingDTO writingDTO) throws Exception{
		return writingDAO.setWritingDelete(writingDTO);
	}
	
	public int setWritingInsert(WritingDTO writingDTO) throws Exception{
		return writingDAO.set
	}
}
