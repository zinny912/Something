package com.home.st1.writing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	
}
