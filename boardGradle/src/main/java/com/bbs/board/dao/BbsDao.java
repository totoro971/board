package com.bbs.board.dao;

import java.util.List;
import com.bbs.board.dto.BbsDto;

public interface BbsDao {
	public List<BbsDto> getList();
	public int addDoc(BbsDto dto); 
	
	public List<BbsDto> getSearchList(BbsDto dto);	
	
	public BbsDto getDetail(BbsDto dto);
}
