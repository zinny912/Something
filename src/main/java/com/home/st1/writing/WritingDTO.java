package com.home.st1.writing;

import java.sql.Date;

public class WritingDTO {
	private Long writingId;
	private String id;
	private Long typeId;
	private String writingTitle;
	private Date writingDate;
	private Long writingView;
	private String writingDetail;
	private WritingImgDTO writingImgDTO;
	
	public WritingImgDTO getWritingImgDTO() {
		return writingImgDTO;
	}
	public void setWritingImgDTO(WritingImgDTO writingImgDTO) {
		this.writingImgDTO = writingImgDTO;
	}
	public Long getWritingId() {
		return writingId;
	}
	public void setWritingId(Long writingId) {
		this.writingId = writingId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getWritingTitle() {
		return writingTitle;
	}
	public void setWritingTitle(String writingTitle) {
		this.writingTitle = writingTitle;
	}
	
	
	public Date getWritingDate() {
		return writingDate;
	}
	public void setWritingDate(Date writingDate) {
		this.writingDate = writingDate;
	}
	public Long getWritingView() {
		return writingView;
	}
	public void setWritingView(Long writingView) {
		this.writingView = writingView;
	}
	public String getWritingDetail() {
		return writingDetail;
	}
	public void setWritingDetail(String writingDetail) {
		this.writingDetail = writingDetail;
	}
	
	
	
}
