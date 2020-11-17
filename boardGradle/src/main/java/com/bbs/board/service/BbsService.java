package com.bbs.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbs.board.dao.BbsDao;
import com.bbs.board.dto.BbsDto;

@Service
public class BbsService {
	
	@Autowired
	BbsDao bbsDao;
	
	public List<BbsDto> getList() {
		return bbsDao.getList();
	}
<<<<<<< HEAD
	
	public int addDoc(BbsDto dto) {
		return bbsDao.addDoc(dto);  
	}

	public List<BbsDto> getSearchList(BbsDto dto) {
		return bbsDao.getSearchList(dto);
	}

	public BbsDto getDetail(BbsDto dto) {
		return bbsDao.getDetail(dto);
	}
	
=======

>>>>>>> refs/remotes/origin/main
}
