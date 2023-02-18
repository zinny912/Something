package com.home.st1.writing;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.home.st1.util.FileManager;
import com.home.st1.util.Pagination;
@Service
public class WritingService {
	
	@Autowired
	private WritingDAO writingDAO;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private FileManager fileManager;
	
	
	public List<WritingDTO> getNoticeList(Pagination pagination) throws Exception{
		
		Long total = writingDAO.getNoticeCount(pagination);
		
		pagination.makeRow();
		
		pagination.makeBlock(total);
		
		return writingDAO.getNoticeList(pagination);
	}
	
	public List<WritingDTO> getWritingList(Pagination pagination) throws Exception{
		
		Long total = writingDAO.getWritingCount(pagination);
		
		pagination.makeRow();
		
		pagination.makeBlock(total);
		
		return writingDAO.getWritingList(pagination);
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
	
	public int setWritingInsert(WritingDTO writingDTO , MultipartFile pic) throws Exception{
		int result = writingDAO.setWritingInsert(writingDTO);

		if(!pic.isEmpty()) {
			String realPath = servletContext.getRealPath("resources/upload/writing");

			String fileName = fileManager.saveFile(pic, realPath);

			WritingImgDTO bankBookImgDTO = new WritingImgDTO();
			bankBookImgDTO.setFileName(fileName);
			bankBookImgDTO.setOriName(pic.getOriginalFilename());
			bankBookImgDTO.setWritingId(writingDTO.getWritingId());
										
			result = writingDAO.setWritingImgInsert(bankBookImgDTO);
		}
		return result;

	}
}
