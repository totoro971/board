package com.bbs.board.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.bbs.board.entity.BbsEntity;

public interface BbsRepository extends CrudRepository<BbsEntity, Integer> {

	List<BbsEntity> findAllByOrderBySeqDesc();
	
	
	
}
