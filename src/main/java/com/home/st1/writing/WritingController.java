package com.home.st1.writing;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.home.st1.util.Pagination;

@Controller
@RequestMapping("/writing/*")
public class WritingController {
	
	@Autowired
	private WritingService writingService;
	
	@RequestMapping(value = "noticeList")
	public ModelAndView getNoticeList(Pagination pagination) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<WritingDTO> list = writingService.getNoticeList(pagination);
		
		mv.addObject("list", list);
		mv.addObject("pagination", pagination);
		mv.setViewName("/writing/noticeList");
		return mv;
	}
	
	@RequestMapping(value = "noticeInsert", method=RequestMethod.GET)
	public ModelAndView setNoticeInsert() throws Exception{
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
	@RequestMapping(value = "list")
	public ModelAndView getWritingList(Pagination pagination) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<WritingDTO> list = writingService.getWritingList(pagination);
		
		mv.addObject("list", list);
		mv.addObject("pagination", pagination);
		mv.setViewName("/writing/list");
		
		return mv;
	}
	
	@RequestMapping(value = "detail")
	public ModelAndView getWritingDetail(WritingDTO writingDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		writingDTO = writingService.getWritingDetail(writingDTO);
		writingDTO.setId(null);
		mv.addObject("dto", writingDTO);
		mv.setViewName("/writing/detail");
		
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setWritingUpdate(WritingDTO writingDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		writingDTO = writingService.getWritingDetail(writingDTO);
		mv.setViewName("/writing/update");
		mv.addObject("dto", writingDTO);
		
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setWritingUpdate(WritingDTO writingDTO, ModelAndView mv) throws Exception{
		mv = new ModelAndView();
		
		int result = writingService.setWritingUpdate(writingDTO);
		if(writingDTO.getTypeId()==1) {
			mv.setViewName("redirect:./noticeList");
		}else if(writingDTO.getTypeId()==2) {
			mv.setViewName("redirect:./list");
		}
		
		return mv;
	}
	
	
	@RequestMapping(value = "delete")
	public ModelAndView setWritingDelete(WritingDTO writingDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		int result = writingService.setWritingDelete(writingDTO);
		
		if(writingDTO.getTypeId()==1) {
			mv.setViewName("redirect:./noticeList");
		}else if(writingDTO.getTypeId()==2) {
			mv.setViewName("redirect:./list");
		}		
		
		return mv;
	}
	
	@RequestMapping(value = "insert", method=RequestMethod.GET)
	public ModelAndView setWritingInsert() throws Exception{
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
	//세션에서 로그인된 아이디와 그 아이디의 role에 따른 글 종류 가져오기
	@RequestMapping(value = "insert", method=RequestMethod.POST)
	public ModelAndView setWritingInsert(WritingDTO writingDTO, MultipartFile pic, HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		writingDTO.setId("TEST");
		
		int result = writingService.setWritingInsert(writingDTO, pic);
		
		if(writingDTO.getTypeId()==1) {
			mv.setViewName("redirect:./noticeList");
		}else if(writingDTO.getTypeId()==2) {
			mv.setViewName("redirect:./list");
		}
		
		
		return mv;
	}
}
