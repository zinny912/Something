package com.home.st1.writing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/writing/*")
public class WritingController {
	
	@Autowired
	private WritingService writingService;
	
	@RequestMapping(value = "list")
	public ModelAndView getWritingList() throws Exception{
		ModelAndView mv = new ModelAndView();
		List<WritingDTO> list = writingService.getWritingList();
		
		mv.addObject("list", list);
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
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	
	
	@RequestMapping(value = "delete")
	public ModelAndView setWritingDelete(WritingDTO writingDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		int result = writingService.setWritingDelete(writingDTO);
		
		mv.setViewName("redirect:./list");		
		
		return mv;
	}
	
	@RequestMapping(value = "insert", method=RequestMethod.GET)
	public ModelAndView setWritingInsert() throws Exception{
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
	//세션에서 로그인된 아이디와 그 아이디의 role에 따른 글 종류 가져오기
	@RequestMapping(value = "insert", method=RequestMethod.POST)
	public ModelAndView setWritingInsert(WritingDTO writingDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		writingDTO.setId("TEST");
		writingDTO.setTypeId(2L);
		
		int result = writingService.setWritingInsert(writingDTO);
		
		mv.setViewName("redirect:./list");
		
		return mv;
	}
}
