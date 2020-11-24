package com.bbs.board.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_bbs")
public class BbsEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int seq;
	
	@Column(nullable=false)
	String title;

	@Column(nullable=false)
	String user;
	
	@Column(nullable=true)
	String detl;
	
	
	
	
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDetl() {
		return detl;
	}
	public void setDetl(String detl) {
		this.detl = detl;
	}
	
	
}
