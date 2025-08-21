package com.kh.idol.model.vo;

public class Board {
	
	private int boardNo; //각 보드를 식별할 보드 넘버
	private String boardTitle;
	private String boardContent;
	private String userId;
	private String creatDate;
	
	public Board() {
		super();
	}

	public Board(int boardNo, String boardTitle, String boardContent, String userId, String creatDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.userId = userId;
		this.creatDate = creatDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", userId=" + userId + ", creatDate=" + creatDate + "]";
	}
	
	
	
	
	/*
	 * 제목 
	 * 내용 
	 * 작성자 	
	 * 작성일 	
	 * 
	 */
	
	
	
}
