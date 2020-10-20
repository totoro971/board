package com.bbs.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bbs.board.dto.BbsDto;
import com.bbs.board.service.BbsService;

@Controller
public class BbsContorller {
	@Autowired
	BbsService bbsService;
	
	@GetMapping("/list")
	public ModelAndView list() throws Exception {
		List<BbsDto> list = bbsService.getList();
		
		return new ModelAndView("bbsList", "list", list);
	}
	
}
