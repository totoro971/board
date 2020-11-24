package com.bbs.board.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.bbs.board.dto.BbsDto;
import com.bbs.board.entity.BbsEntity;
import com.bbs.board.service.BbsJpaService;

@Controller
public class BbsJpaController {
	@Autowired
	BbsJpaService bbsJpaService;
	
	@GetMapping("/jpa/list")
	public ModelAndView list() throws Exception {
		List<BbsEntity> list = bbsJpaService.getList();
		
		return new ModelAndView("/jpa/bbsList", "list", list);
	}
	
	@GetMapping("/jpa/add")
	public String add() {
		return "/jpa/add";
	}
	
	@PostMapping("/jpa/add")
	public ModelAndView add(BbsEntity bbsEntity) {
		bbsJpaService.add(bbsEntity);
		
		List<BbsEntity> list = bbsJpaService.getList();
		return new ModelAndView("/jpa/bbsList", "list", list);
	}
	
	@GetMapping("/jpa/detail/{seq}")
	public ModelAndView detail(@PathVariable("seq") String seq) {
		return new ModelAndView("/jpa/detail", "seq", seq);
	}
	
	@GetMapping("/jpa/rest/detail/{seq}")
	@ResponseBody
	BbsEntity getDetail(@PathVariable("seq") int seq) {
		BbsEntity entity = bbsJpaService.getDetail(seq);
		return entity;
	}
}
